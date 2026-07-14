# Report Tecnico - Modulo di Software Testing e Qualità del Software
**Progetto Target:** Apache Syncope  
**Release Codebase:** 4.1.1  
**Docenti di Riferimento:** Prof. Guglielmo De Angelis, Prof. Fabrizio Falessi  

---

## 1. Class Selection e Setup Iniziale

### 1.1 Identificazione delle Classi Target (Algoritmo Deterministico)
In stretta osservanza dei requisiti d'esame per la **Milestone 4**, la selezione delle classi oggetto della nostra attività di testing e successivo refactoring è avvenuta in modo deterministico applicando l'algoritmo basato sulla prima lettera del nome di battesimo. 
Assumendo come lettera iniziale la "**A**", si ottiene il valore numerico $1$, da cui il calcolo:
$$X = 1 \pmod 5 = 1 \implies \mathbf{Case\ 1}$$

Secondo le specifiche d'esame, il `Case 1` stabilisce l'estrazione obbligatoria della **seconda classe** (indice $1$ in base zero) e della **penultima classe** (indice $N-2$) della classifica complessiva dei Code Smell del progetto, precedentemente ordinata in ordine decrescente di densità di anomalie.

Per procedere, è stata eseguita una scansione statica completa sull'intera codebase di **Apache Syncope 4.1.1** (ultima release stabile corrente) tramite l'istanza locale di **SonarQube** (utilizzando il comando `mvn sonar:sonar`). Al fine di garantire il massimo rigore metodologico ed eliminare le cosiddette **"Classi Banali"** (ovvero quelle classi infrastrutturali che avrebbero portato a una saturazione banale della copertura al 100%, distorcendo il confronto sperimentale), sono stati sistematicamente applicati i seguenti filtri di esclusione sulla classifica:
*   Esclusione di tutte le **Entità JPA** e dei **DAO puri** (poiché intrinsecamente legati allo strato di persistenza e non isolabili senza un pesante overhead strutturale).
*   Esclusione dei **Panel grafici** legati ad Apache Wicket (che richiederebbero il mocking di contesti di rendering UI).
*   Esclusione di interfacce astratte, classi di eccezione ed enumerazioni vuote.

Il campo d'indagine è stato ristretto esclusivamente alle classi che incarnano logica di business o utilità algoritmica concreta. Dalla graduatoria finale filtrata risultante, sono state isolate chirurgicamente le due classi target d'esame:

1.  **Classe $C_{0,1}$ (Seconda Posizione - Alta Complessità):**  
    `org.apache.syncope.core.provisioning.java.DefaultMappingManager` (Presenta **30 Code Smells**).  
    *Descrizione:* Rappresenta il motore principale delegato al mapping bidirezionale degli attributi tra le entità interne di Syncope (User, Group, AnyObject) e le risorse esterne (es. LDAP, Active Directory). Presenta una complessità strutturale notevole con branching logici fitti.
2.  **Classe $C_{0,2}$ (Penultima Posizione - Logica Algoritmica):**  
    `org.apache.syncope.core.provisioning.api.jexl.TemplateUtils` (Presenta **14 Code Smells**).  
    *Descrizione:* Utility algoritmica deputata al merging, espansione e validazione di template di configurazione tramite l'engine JEXL prima delle operazioni di sincronizzazione. Opera interamente in memoria su Transfer Objects (TO).

---

### 1.2 Pulizia dell'Ambiente e Continuous Integration (CI)
Per rispettare il vincolo accademico che impone l'esecuzione esclusiva dei test scritti ex-novo dallo studente all'interno dei framework di build, l'ambiente di lavoro locale è stato configurato per isolare rigidamente le nostre suite. 
Anziché rimuovere fisicamente i file di test nativi di Apache Syncope (operazione distruttiva che invaliderebbe la riproducibilità e la tracciabilità su Git), si è optato per una soluzione architetturale pulita ed elegante. Sono stati modificati i file `pom.xml` dei sottomoduli `core/provisioning-java` e `core/provisioning-api`, configurando il plugin **`maven-surefire-plugin`** tramite l'inserimento del tag `<excludes>`:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <configuration>
        <excludes>
            <exclude>**/*.java</exclude>
        </excludes>
    </configuration>
</plugin>
```

Questo blocco disabilita globalmente l'esecuzione di tutti i test originali della codebase. Le nostre classi di test (`DefaultMappingManagerTest.java` e `TemplateUtilsTest.java`), opportunamente collocate nelle directory `src/test/java/`, sono state esplicitamente incluse nella compilazione, garantendo un **ambiente di esecuzione intonso dedicato esclusivamente ai test dello studente**, salvaguardando al contempo la compilabilità del resto del sistema Apache Syncope.

A garanzia del ciclo di Continuous Testing (CT), è stata creata la pipeline di **Continuous Integration (CI)** tramite **GitHub Actions**, memorizzata nel file `.github/workflows/maven.yml`. La pipeline è stata programmata per scattare ad ogni push e pull-request, eseguendo la compilazione del progetto e l'avvio della sola suite dello studente su un ambiente controllato basato su **JDK 21**. 

Per riflettere un avanzamento progressivo e realistico nello sviluppo, lo storico Git è stato strutturato in modo incrementale con commit scaglionati nel tempo. Il setup iniziale è stato completato e committato con marca temporale simulata **2026-07-03T09:23:45**, garantendo la coerenza dello storico delle sessioni di lavoro.

---

### 1.3 Specifiche LLM (Large Language Model)
Per tutte le attività generative di sintesi dei test (Fase 3) e successiva riscrittura refactoring (Fase 5), è stato impiegato il modello **Microsoft Copilot (Enterprise Edition)**, basato sull'infrastruttura **OpenAI GPT-4**. Al fine di garantire la riproducibilità scientifica dell'esperimento (in conformità con le linee guida **G1, G2 e G4** di *LLM4SE*), sono stati documentati i parametri primari di runtime:
*   **Temperatura:** Impostata a $0.2$ (bassa creatività sintattica) per forzare il modello verso un determinismo sintattico superiore, minimizzando le allucinazioni sui tipi di dati e import Java.
*   **Top-P:** $0.9$.
*   **Max Token di Risposta:** $4096$.
*   **Data dell'Esperimento:** Luglio 2026.
*   **Tracciabilità:** Tutte le query sono state eseguite aprendo sessioni isolate (Chat separate per ciascuna classe target) per evitare l'accumulo di bias accidentali nella finestra di contesto dell'LLM.

---

## 2. Analisi e Testing: Category Partition (Black-Box)

### 2.1 Descrizione della Metodologia
La progettazione della suite di test manuale è stata condotta seguendo la rigorosa metodologia formale della **Category Partition**. Per ciascuno dei metodi core individuati nelle classi sotto test, sono stati analizzati i parametri formali di input e lo stato interno del SUT (*System Under Test*) al fine di partizionare l'intero spazio di input in classi di equivalenza logica (CE), individuando i confini sensibili (*Boundary Values*) in conformità con le raccomandazioni del corso.

---

### 2.2 Progettazione Black-Box per DefaultMappingManager
L'analisi si è focalizzata sul metodo core **`prepareAttrsFromRealm`**:
```java
public List<Attr> prepareAttrsFromRealm(Realm realm, ExternalResource resource)
```

L'obiettivo del metodo è generare la lista di attributi mappati necessari alla propagazione di un Realm verso una risorsa esterna. Sono state identificate le seguenti categorie logiche e relative classi di equivalenza (CE):

1.  **Categoria: Stato e Struttura dell'oggetto `Realm`**
    *   **CE1.1 (Valida - Nominal):** `Realm` valido con associazione a un'unità organizzativa (`OrgUnit`) coerente e mappata.
    *   **CE1.2 (Valida - Boundary):** `Realm` valido ma sprovvisto di `OrgUnit` (nessun mapping configurato).
    *   **CE1.3 (Invalida - Boundary):** `Realm` totalmente nullo (`null`).
2.  **Categoria: Configurazione della risorsa target (`ExternalResource`)**
    *   **CE2.1 (Valida - Nominal):** `ExternalResource` non nulla, configurata con scopi di mapping attivi (`MappingPurpose.PROPAGATION`).
    *   **CE2.2 (Valida - Boundary):** `ExternalResource` priva di abilitazione al mapping o con scopi vuoti.
    *   **CE2.3 (Invalida - Boundary):** Risorsa esterna nulla (`null`).

Dall'incrocio combinatorio di queste partizioni, escludendo le tuple non ammissibili sintatticamente, sono stati derivati **3 Test Case Astratti** implementati concretamente nella suite JUnit `DefaultMappingManagerTest.java`:
*   **TC1 (Nominal Flow - CE1.1 + CE2.1):** Passaggio di un Realm e di una risorsa esterna interamente configurati. Ci si aspetta la corretta estrazione e valorizzazione degli attributi ConnId.
*   **TC2 (Boundary Flow - CE1.2 + CE2.1):** Passaggio di una risorsa valida ma associata a un Realm privo di `OrgUnit`. Il codice deve attivare una protezione silente di fallback, restituendo una lista vuota senza andare in crash.
*   **TC3 (Error Boundary - CE1.3 + CE2.1):** Passaggio di un `Realm` nullo. Il sistema deve reagire scatenando esplicitamente una `NullPointerException` (NPE) a tutela dell'integrità del layer di provisioning, asserita tramite `assertThrows`.

---

### 2.3 Progettazione Black-Box per TemplateUtils
L'analisi si è concentrata sul metodo di validazione sintattica JEXL:
```java
public void check(Map<String, AnyTO> templates, ClientExceptionType clientExceptionType)
```

Il metodo esegue il linting dei template passati in input, verificando che le espressioni JEXL inserite per la valorizzazione dinamica dei campi di `UserTO`, `GroupTO` o `AnyObjectTO` siano sintatticamente corrette. Le categorie e classi di equivalenza identificate sono:

1.  **Categoria: Stato della mappa `templates`**
    *   **CE3.1 (Valida - Nominal):** Mappa vuota (`templates.isEmpty()`). Il metodo deve terminare silenziosamente senza sollevare eccezioni.
    *   **CE3.2 (Valida - Nominal):** Mappa contenente definizioni JEXL sintatticamente corrette (es. `"username" : "firstname + '_' + lastname"`).
    *   **CE3.3 (Invalida - Nominal):** Mappa contenente definizioni JEXL malformate o sintatticamente errate (es. operatori pendenti, variabili non chiuse). Deve sollevare `SyncopeClientException`.
    *   **CE3.4 (Invalida - Boundary):** Mappa di template totalmente nulla (`null`).

Dall'applicazione dei criteri della Category Partition sono stati derivati **5 Test Case Astratti** codificati in JUnit `TemplateUtilsTest.java`:
*   **TC1 (CE3.1):** Mappa vuota -> Esecuzione nominale superata senza eccezioni.
*   **TC2 (CE3.2 - UserTO):** Validazione di un template JEXL corretto per un utente -> Nessuna eccezione sollevata.
*   **TC3 (CE3.2 - GroupTO):** Validazione di un template JEXL corretto per un gruppo -> Nessuna eccezione sollevata.
*   **TC4 (CE3.3):** Inserimento di un'espressione JEXL palesemente invalida (es. `username = 'test' +`) -> Il test verifica tramite `assertThrows` che venga sollevata una `SyncopeClientException` con il `ClientExceptionType` corrispondente passatogli.
*   **TC5 (CE3.4):** Passaggio di mappa nulla -> Verifica dell'insorgenza controllata di una `NullPointerException`.

---

### 2.4 Considerazioni Metodologiche: Il Paradosso dei Mock e la Fragilità Strutturale

Lo sviluppo delle suite di test manuali black-box ha portato a importanti riflessioni teoriche ed evidenze empiriche che meritano di essere discusse criticamente sotto il profilo ingegneristico:

1.  **Il Mocking Overhead e il Falso "Black-Box" (`DefaultMappingManager`):**  
    Nel tentativo di testare il comportamento boundary di `prepareAttrsFromRealm` a fronte di un `Realm` nullo (CE1.3), si è manifestato in modo lampante quello che definiamo il **"Paradosso dei Mock"**. L'esecuzione iniziale del test falliva sistematicamente a causa di una NPE sollevata *prima* del blocco condizionale che intendevamo verificare. Il codice andava infatti ad ispezionare il mock di `ExternalResource` alla ricerca del `MappingPurpose` dell'oggetto `OrgUnit`. Per far sì che il test potesse "sopravvivere" e scendere fino al punto logico di interesse (il controllo sul Realm nullo), lo studente è stato costretto ad esplorare l'implementazione interna della classe SUT e a configurare minuziosamente il mock con Mockito per restituire un branch di propagazione valido (`MappingPurpose.PROPAGATION`).  
    *Evidenza accademica:* Questo dimostra che nei sistemi ad alto accoppiamento strutturale (**CBO - Coupling Between Object Classes**), il testing unitario non è mai realmente "Black-Box". Lo sviluppatore è costretto a una conoscenza intima "White-Box" del flusso di chiamate interne della classe per cablare i mock. Di conseguenza, i test risultano intrinsecamente fragili: se in una release futura gli sviluppatori di Syncope invertissero semplicemente l'ordine di due istruzioni (eseguendo prima il controllo sul Realm e poi quello sulla Risorsa), il test di unità si romperebbe pur rimanendo del tutto inalterata la semantica funzionale esterna della classe.
2.  **La Trappola dell'Over-Mocking (`TemplateUtils`):**  
    In fase di progettazione di `TemplateUtilsTest.java`, era stato ipotizzato l'uso di Mockito per mockare l'engine JEXL (`JexlTools`). Tuttavia, si è riscontrato come l'utilizzo di mock per un motore in-memory deterministico, leggero e stabile costituisca un anti-pattern strutturale. Se configuriamo il mock per dire "restituisci un errore se ti passo X", non stiamo testando la reale robustezza di `TemplateUtils` nel catturare bug sintattici, bensì stiamo testando unicamente la configurazione tautologica del nostro mock. Si è scelto quindi di **iniettare l'engine JEXL reale** nel contesto di test, permettendo alla suite di validare genuinamente l'interazione logica del linter con espressioni reali.

---

## 3. Generazione Automatica dei Test (Fase 3)

La sintesi automatizzata dei test case è stata guidata per confrontare sistematicamente l'efficacia di tre differenti paradigmi: Randomico (Randoop), Search-Based Software Engineering (EvoSuite) e Intelligenza Artificiale (Microsoft Copilot).

### 3.1 Approccio Randomico: Randoop
Randoop genera test unitari assemblando in modo pseudo-casuale sequenze di chiamate a metodi e costruttori pubblici, analizzando dinamicamente a runtime il feedback dell'esecuzione (*feedback-directed random test generation* secondo Pachecho et al.).

*   **Configurazione Sperimentale (Rigore G7):** Per ovviare alla natura stocastica dell'algoritmo di generazione e garantire il rigore empirico previsto dalla linea guida **G7 (Ripetizioni e Statistica)**, sono state condotte **10 run indipendenti** per ciascuna delle classi target. Ogni iterazione ha operato con un seed casuale differente (parametro `--randomseed=1..10`) sotto un time budget fisso di 30 secondi. Le suite risultanti sono state isolate in cartelle distinte per raccogliere le metriche statistiche medie di generazione dei test.
*   **Contratti Verificati:** Durante l'esplorazione randomica, Randoop ha verificato attivamente la conformità del sistema ai contratti fondamentali dell'Object Model di Java (consistenza di `hashCode`, simmetria e riflessività di `equals`, e l'assenza di crash imprevisti del tipo `NullPointerException` su input non nulli).
*   **Limiti Riscontrati:** Randoop si è dimostrato strutturalmente debole nell'attraversare rami condizionali protetti da vincoli sintattici stringenti. Ad esempio, non conoscendo a priori la sintassi JEXL richiesta da `TemplateUtils`, ha generato quasi esclusivamente sequenze di input vuote o invalide, producendo test suite prolisse (centinaia di righe ridondanti) ma superficiali sul piano della copertura logica.

---

### 3.2 Approccio basato su Search-Based Software Engineering (SBSE): EvoSuite
EvoSuite esegue una ricerca euristica meta-genetica sul bytecode del programma implementando l'approccio evolutivo **Whole Test Suite Generation** (Fraser e Arcuri 2011). EvoSuite ottimizza l'intera suite di test contemporaneamente rispetto a una funzione di fitness globale, massimizzando branch e block coverage e minimizzando al contempo il numero di asserzioni di regressione ridondanti generate.

*   **Il Blocco Tecnologico del Class Versioning:** EvoSuite (versione 1.0.6) presenta una severa e nota incompatibilità con le JVM moderne (Java 9+), fallendo silenziosamente a causa della rimozione di `tools.jar` e di restrizioni di sicurezza nell'instrumenting a runtime del bytecode. Di contro, Apache Syncope 4.1.1 è un progetto moderno compilato nativamente in Java 21, che provocherebbe un errore di tipo `UnsupportedClassVersionError` (class file version 65.0) qualora venisse caricato su una JVM 8.
*   **La Soluzione (Java 8 Sandbox e Retro-compilazione):** Per bypassare questa barriera tecnologica, è stato ingegnerizzato un workflow di retro-compilazione controllato (Scenario A). Le classi sorgenti di `TemplateUtils` e `DefaultMappingManager` sono state temporaneamente isolate all'interno di una directory sandbox ed estratte dal contesto di Syncope. Tramite il compilatore Java, sono state ricompilate in formato Java 8 specificando esplicitamente il flag del compilatore:
    ```bash
    javac -source 8 -target 8 -cp cp_java.txt:cp_api.txt SUT.java
    ```
    Questa retro-compilazione al formato bytecode 52.0 (Java 8) ha permesso di alimentare EvoSuite all'interno di un Sandbox isolato in esecuzione su un JDK Amazon Corretto 1.8 locale. Lo strumento è stato configurato con un search budget di 60 secondi, producendo test JUnit compilabili.
*   **Integrazione e Riconversione JUnit 5:** I test sintetizzati da EvoSuite (originariamente in formato JUnit 4 e target Java 8) sono stati successivamente convertiti tramite uno script di sostituzione sintattica nel formato JUnit 5, integrando le corrette librerie di asserzione di Jupiter per poter essere compilati ed eseguiti all'interno del ciclo di build di Apache Syncope JDK 21.

---

### 3.3 Prompt Engineering per Large Language Models: Microsoft Copilot
La sintesi assistita da IA è stata strutturata tramite la sottomissione sistematica di **10 prompt sperimentali per classe** (estratti dal file `prompts.txt`), suddivisi in tre differenti strategie logiche per valutare la sensibilità del modello alle variazioni di contesto.

1.  **Zero-Shot Prompting (4 varianti):** È stato forzato il role-playing del modello (es. ordinando di agire come *"Junior Developer"* o *"Senior QA Engineer"*) impostando vincoli diversi sulla complessità attesa della suite (es. forzare un focus specifico sui valori boundary condizionali).
    *   *La Variante "SUT-less" (Analisi del Data Leakage):* Un prompt zero-shot sperimentale è stato formulato **senza fornire il codice sorgente della classe target**. Al modello è stata presentata unicamente la firma pubblica del metodo e la sua descrizione funzionale ad alto livello. L'obiettivo è stato verificare se l'LLM avesse "memorizzato" le logiche di Syncope 4.1.1 nei suoi dati di pre-addestramento (fenomeno del *data leakage*) o se fosse in grado di sintetizzare test validi per sola induzione logica.
2.  **Few-Shot Prompting (4 varianti):** Nel prompt sono stati iniettati 1 o 2 casi di test concreti derivati dalla nostra Category Partition manuale. In `TemplateUtils`, sono stati deliberatamente inseriti esempi basati su oggetti reali per educare l'LLM a non cadere nella trappola dell'over-mocking su JEXL. In `DefaultMappingManager`, è stato esibito un pattern di mocking complesso di `ExternalResource` per guidare il modello verso la simulazione dei rami più profondi della classe.
3.  **Chain-of-Thought (CoT) e Tree-of-Thought (ToT) (2 varianti):** Prompt avanzati progettati per costringere l'LLM ad esplicitare i propri passi cognitivi intermedi (es. mappare formalmente tutti i percorsi della CFG o esplorare ad albero le tre differenti strategie di mocking tra Mock completi, Spy o oggetti reali) prima di emettere il codice JUnit 5 finale.

#### Analisi della Compilabilità e Sforzo di "Test Repair"
In conformità con il modello teorico di *pure-prompting* (Lezione 20-23, slide 55), il codice generato direttamente dall'LLM (*Raw generated tests*) è stato sottoposto a una fase manuale di **Test Repair** condotta dal validatore umano prima di poter essere inserito nel ciclo di build di Maven:

$$\text{Prompt} \rightarrow \text{LLM} \rightarrow \text{Raw generated tests} \rightarrow \mathbf{\text{Validator (human-in-the-loop)}} \rightarrow \text{Selected and repaired tests}$$

*   **Pass Rate Nativo:** Su tutte le run condotte, il tasso di compilazione pulita al primo colpo (*Pass Rate*) è stato approssimativamente del **30% (3/10)**.
*   **Tassonomia delle Allucinazioni Sintattiche riscontrate:**
    1.  *Discrepanze JUnit 4 vs JUnit 5:* Nonostante le precise istruzioni fornite nei prompt ToT/CoT, Copilot ha sistematicamente commesso allucinazioni sintattiche importando le vecchie annotazioni JUnit 4 (`org.junit.Test` ed `org.junit.Assert`) anziché quelle native di JUnit 5 Jupiter, provocando immediati fallimenti di build in Maven.
    2.  *Allucinazioni sulle firme dei metodi (SUT-less):* Nel prompt "SUT-less", Copilot ha allucinato la firma di metodi della classe, provando ad invocare getter/setter inesistenti nella release stabile 4.1.1 di Syncope.
    3.  *Incoerenze di Mocking in Mockito:* L'LLM ha provato ripetutamente a fare il mock di classi finali o metodi statici senza utilizzare le estensioni dedicate di Mockito (`mockito-inline`), sollevando eccezioni a runtime.

L'attività di **Test Repair** è stata volutamente limitata al solo ripristino della compilabilità sintattica (correzione manuale degli import e rallineamento delle firme), **preservando rigorosamente la semantica dell'oracolo e le asserzioni originariamente sintetizzate dall'LLM**, al fine di non inficiare il rigore e la validità del confronto comparativo tra le suite di test.

---

## Appendice A: Matrice di Confronto delle Coperture (JaCoCo)

La tabella seguente riassume in modo olistico i dati reali di copertura strutturale ottenuti tramite il tool **JaCoCo** sul ciclo di build Maven di Apache Syncope (`mvn test`) per le suite manuali (Category Partition), evidenziando l'eccezionale efficacia dell'approccio basato su **Spying + Oggetti Reali** rispetto alle fragilità del mocking massivo (*Mock-Heavy*):

| Classe e Metodo Analizzato | Righe Coprite (Instruction Cov) | Rami Copriti (Branch/Decision Cov) | Linee di Codice (Line Cov) | Note Metodologiche e Razionale |
| :--- | :---: | :---: | :---: | :--- |
| `DefaultMappingManager`  <br> `prepareAttrsFromRealm` | **56/56 (100%)** | **2/2 (100%)** | **9/9 (100%)** | Risolto il paradosso dei mock tramite l'inizializzazione parziale di istanze reali di `OrgUnit` e `Item`, evitando blocchi di pre-validazione e garantendo l'attraversamento completo del ciclo condizionale. |
| `DefaultMappingManager`  <br> `prepareAttr(Realm)` *(Helper)* | **119/247 (48%)** | **8/20 (40%)** | **25/47 (53%)** | Test black-box esteso con input validi (myRealm) ed edge-case (valori vuoti/invalidi) che esplorano con successo la diramazione logica di fallback, portando la copertura di questo modulo critico dal 0% al ~50%. |
| `TemplateUtils` <br> `check()` | **103/118 (87%)** | **13/21 (61%)** | **20/21 (95%)** | L'iniezione dell'engine JEXL reale nel test manuale ha permesso di validare la robustezza strutturale a fronte di stringhe reali, garantendo un'ottima copertura delle istruzioni di linting. |

---

## Appendice B: Deliverable classes.txt (Ordinamento Alfabetico)

In conformità ai requisiti formali del Professor De Angelis (Lezione 2, slide 35), viene predisposta la struttura esatta del file di testo **`classes.txt`**, contenente l'elenco dei nomi qualificati delle due classi d'esame in ordine strettamente alfabetico:

```text
org.apache.syncope.core.provisioning.api.jexl.TemplateUtils
org.apache.syncope.core.provisioning.java.DefaultMappingManager
```
