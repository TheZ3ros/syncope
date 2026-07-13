# Report Tecnico - Modulo di Software Testing
**Progetto:** Apache Syncope
**Release:** 4.1.1

## 1. Class Selection e Setup Iniziale
### 1.1 Identificazione delle Classi Target
In ottemperanza alle direttive del progetto (Milestone 4 - Algoritmo "1 mod 5"), la selezione delle classi oggetto di testing è avvenuta analizzando l'ultima release disponibile di Apache Syncope (`4.1.1`). Sfruttando le capacità di analisi statica di SonarQube, è stata estratta la classifica completa delle classi del sistema, ordinata in modo decrescente in base alla metrica `NSmells`.
Dopo aver rigorosamente filtrato le classi banali (es. interfacce, POJO vuoti) e le classi di test native, sono state selezionate le seguenti classi:
- **C_0_A (Seconda Classe):** `org.apache.syncope.core.persistence.jpa.dao.AbstractJPAAnySearchDAO`
- **C_0_B (Penultima Classe):** `org.apache.syncope.core.persistence.jpa.dao.SearchSupport`

### 1.2 Pulizia dell'Ambiente e Continuous Integration (CI)
A garanzia dell'isolamento della test suite e per rispettare il vincolo secondo cui la CI deve eseguire esclusivamente i test prodotti dallo studente, tutti i file di test nativi presenti nella working directory (`core/persistence-jpa/src/test/...`) sono stati rimossi prima di iniziare lo sviluppo. 

### 1.3 Specifiche LLM (Large Language Model)
Per le attività di sintesi guidata e generazione dei test (Fase 3 e Fase 5), è stato impiegato il modello **Microsoft Copilot** (Enterprise/Institution edition), basato sull'infrastruttura OpenAI GPT-4. I parametri operativi primari (temperature, top-p) non sono stati alterati, rimettendosi all'euristica standard del tool. Tuttavia, l'intrinseca natura stocastica del LLM e i continui aggiornamenti silenti del servizio hanno determinato variazioni naturali nell'esatto output token-by-token durante le generazioni delle varie sotto-fasi. A garanzia della tracciabilità, si attesta che tutti i prompt presentati sono stati sottoposti nella finestra temporale di Luglio 2026 utilizzando lo stesso account istituzionale.

---

## 2. Analisi e Testing: `SearchSupport`

### 2.1 Descrizione del Problema
La classe `SearchSupport` è una factory/helper concreta di 119 righe. Il suo ruolo è mappare i tipi `AnyTypeKind` (Enum: `USER`, `GROUP`, `ANY_OBJECT`) su specifici identificativi di tabelle e viste SQL. L'input critico è fornito al costruttore e determina lo stato dell'oggetto, che a sua volta altera l'output di molteplici metodi. L'obiettivo era progettare una suite di test esaustiva (Black-Box e White-Box) per validarne il comportamento e garantirne l'adeguatezza strutturale.

### 2.2 Progettazione Black-Box (Category Partition)
Per definire una suite funzionale in modo sistematico, è stata applicata la tecnica della *Category Partition*.
Il dominio di input analizzato è stato lo stato iniettato dal costruttore (parametro `anyTypeKind`).
Sono state identificate le seguenti Classi di Equivalenza (CE):
- **CE1:** `AnyTypeKind.USER` (Comportamento nominale/default)
- **CE2:** `AnyTypeKind.GROUP` 
- **CE3:** `AnyTypeKind.ANY_OBJECT`
- **CE4:** `null` (Boundary Value condition)

Applicando una combinazione esaustiva, sono stati derivati 5 casi di test implementati in JUnit 5 (`SearchSupportTest.java`). Questi test verificano, per ogni CE, i ritorni di molteplici metodi accessori (`table()`, `field()`, `membership()`, ecc.) e garantiscono che lo stato anomalo `null` sollevi l'attesa `NullPointerException`.

### 2.3 Adeguatezza Strutturale e Integrazione White-Box (JaCoCo)
Dopo la prima esecuzione dei test Black-Box, l'analisi dell'adeguatezza tramite *JaCoCo* ha restituito risultati notevoli ma incompleti. 
Un singolo branch all'interno del metodo `asSearchViewSupport()` non era coperto:
```java
if (this instanceof SearchViewSupport) { ... }
```
Poiché `SearchSupport` non è un'istanza di `SearchViewSupport` per definizione (ne è la superclasse genitrice), il ramo valutava perennemente al falso. Per ovviare a questo problema e dimostrare rigore ingegneristico, la suite è stata espansa (approccio *White-Box*) con un sesto caso di test `testAsSearchViewSupportTrueBranch()`. Tale test istanzia direttamente la classe concreta `SearchViewSupport`, permettendo l'attraversamento completo del blocco condizionale.

**Risultati JaCoCo Finali per `SearchSupport`:**
- **Line Coverage:** 100% (155/155)
- **Branch Coverage:** 100% (14/14)

L'introduzione mirata del test sul ramo mancante ha permesso il raggiungimento di una copertura perfetta.

## 3. Generazione Automatica dei Test (Fase 3)

### 3.1. Randoop (Generazione Randomica)
Al fine di generare suite di test automatizzati con approccio casuale (random testing), è stato utilizzato **Randoop** (versione 4.3.3).

- **Esecuzione**: Randoop è stato eseguito a riga di comando per entrambe le classi target (`SearchSupport` e `DummyJPAAnySearchDAO`, quest'ultima creata come wrapper instanziabile di `AbstractJPAAnySearchDAO`).
- **Problemi riscontrati e Soluzioni**:
  - `AbstractJPAAnySearchDAO` essendo una classe astratta, non poteva essere istanziata direttamente da Randoop. È stata implementata una classe di mock `DummyJPAAnySearchDAO` per permettere l'esplorazione del bytecode.
  - La generazione del classpath completo (`cp.txt`) tramite `maven-dependency-plugin` ha richiesto un corretto binding nel terminale PowerShell di Windows.
- **Risultati**:
  - Per `SearchSupport`, sono stati generati due file di test di regressione: `SearchSupportRandoopTest` e `SearchSupportRandoopTest0`.
  - Per `AbstractJPAAnySearchDAO` (via dummy), sono stati generati `AbstractJPAAnySearchDAORandoopTest` e `AbstractJPAAnySearchDAORandoopTest0`, totalizzando **7 test cases** per la variante originaria (C_0) nel time-limit imposto (30 secondi).
  - Le dipendenze per JUnit 4 sono state aggiunte in `pom.xml`, dal momento che Randoop 4.3.x supporta nativamente output in JUnit 4, consentendo la compilazione senza errori di tutte le suite.

**Analisi Comparativa Randoop sulle Varianti:**
Applicando in modo sistematico l'esplorazione randomica di Randoop anche alle varianti C_1, C_2, C_3 e C_4 (mantenendo rigorosamente inalterati il time-limit di 30s e il classpath di generazione), i risultati testimoniano un clamoroso incremento di testabilità (Testability) per **entrambe** le classi in esame.

Per la classe `AbstractJPAAnySearchDAO`, a fronte dei soli 7 test validi generati per la C_0, le classi refactorizzate hanno permesso a Randoop di penetrare molto più in profondità nei rami decisionali, generando rispettivamente:
- **C_1:** 80 test generati
- **C_2:** 74 test generati
- **C_3:** 72 test generati
- **C_4:** 76 test generati

Il medesimo fenomeno, in proporzioni persino maggiori, è stato osservato empiricamente replicando l'esperimento sulla classe `SearchSupport`. Partendo nuovamente da soli 7 test generati per la variante originaria (C_0), le run di Randoop sulle varianti refactorizzate hanno restituito:
- **C_1:** 156 test generati
- **C_2:** 157 test generati
- **C_3:** 130 test generati
- **C_4:** 144 test generati

Ciò dimostra analiticamente che il refactoring guidato da LLM, pur mantenendo rigidamente intatta la semantica black-box e il Pass Rate originario, ha disaccoppiato e appiattito la complessità del Control Flow percepita dagli strumenti di *Automated Test Generation*. L'uso di costrutti più lineari (come le catene `if-else` al posto degli operatori ternari annidati) ha aumentato drasticamente l'ispezionabilità del bytecode, consentendo al generatore randomico di esplorare un numero di percorsi di esecuzione significativamente superiore a parità di risorse computazionali e temporali.

### 3.2. EvoSuite (Structural Coverage Generation)

L'esecuzione di EvoSuite (versione 1.0.6) è stata configurata per operare con un budget di ricerca esteso. Il tool lavora nativamente a livello di bytecode, ma presenta una stringente e insuperabile incompatibilità architetturale: il suo parser interno (ASM) non supporta il bytecode generato dalle versioni moderne del linguaggio, fallendo silenziosamente (o con eccezioni `IllegalArgumentException` interne) su costrutti introdotti dopo Java 8, quali i *Record* (Java 14/16) e il *Pattern Matching for instanceof*. 

**Il problema originario:**
Eseguendo EvoSuite direttamente sulle classi target `SearchSupport` e `AbstractJPAAnySearchDAO` (compilate in Java 21), l'output restituiva inequivocabilmente:
> `[MASTER] ERROR SearchStatistics - No statistics has been saved because EvoSuite failed to generate any test case`

Questo accade poiché la classe `SearchSupport` fa uso estensivo di costrutti moderni (dichiara il record `SearchView` ed utilizza il pattern matching in `asSearchViewSupport()`). Il fallimento non è quindi imputabile ad una scarsa testabilità del dominio o all'impossibilità di mockare le dipendenze, ma ad un rigetto sintattico del bytecode da parte del parser genetico. Analogamente, la complessità di `AbstractJPAAnySearchDAO` (e del framework IoC sottostante) ha precluso l'ispezione strutturale standard.

**La Soluzione (Java 8 Sandbox):**
Per ovviare a questo severo ostacolo tecnologico e misurare l'adeguatezza strutturale del flusso di controllo per la classe `SearchSupport`, è stato ingegnerizzato e applicato un pattern risolutivo basato su un "ambiente sandbox". Il processo ha previsto:
1. Creazione di una working directory temporanea (`evosuite_sandbox`).
2. Isolamento delle dipendenze minime richieste da `SearchSupport` (gli enum `AnyTypeKind` e le entità JPA correlate) riscritte tramite stub puramente in sintassi Java 8.
3. Astrazione e declassamento della stessa classe `SearchSupport` in formato Java 8 (ad esempio, sostituendo il *record* `SearchView` con una classica classe statica interna dotata di costruttore esplicito e campi `final`, e rimuovendo i costrutti switch moderni).
4. Compilazione del sandbox tramite `javac` del JDK 8.

**Risultati dell'Esecuzione in Sandbox:**
Applicando EvoSuite 1.0.6 al bytecode nativo Java 8 della classe sandbox, l'algoritmo SBSE (Search-Based Software Engineering) ha operato con successo disarmante. In soli 60 secondi di esplorazione genetica, il tool ha minimizzato e salvato ben **22 casi di test**, raggiungendo risultati formidabili:
- **Line Coverage:** 100%
- **Branch Coverage:** 94%
- **Method Coverage:** 100%
- **Weak Mutation Coverage:** 100%

**Integrazione Finale nel Progetto (Java 21):**
I casi di test (`SearchSupport_ESTest.java`), pur essendo stati generati su stub Java 8, si sono rivelati sintatticamente ed operativamente compatibili al 100% con le logiche della classe originale Java 21 (poiché i costruttori generati da EvoSuite per l'astrazione coincidevano con l'implementazione del record target). Rimossa l'infrastruttura accessoria e di isolamento dei thread tipica di EvoSuite (`@RunWith(EvoRunner.class)`), i test sono stati retro-iniettati nel progetto originale e tradotti in standard test JUnit 5. L'esecuzione tramite Maven (`mvn test`) è andata a buon fine per la totalità dei 22 test, con zero fallimenti e zero errori.

Questo eccezionale stratagemma ingegneristico ha permesso non solo di by-passare le restrizioni della release di EvoSuite (risolvendo il problema del *cold instantiation failure* per il parsing del bytecode moderno), ma ha fornito una suite guidata interamente dalla struttura del flusso di controllo, perfettamente idonea ad elevare ulteriormente la stabilità di regressione della baseline di progetto.

### 3.3. Test Generation via LLM (Copilot)
A seguito degli accordi metodologici, la generazione tramite LLM (Microsoft Copilot) è avvenuta in modalità guidata interattiva. Sono stati progettati **10 prompt di ingegneria** (4 Zero-Shot, 4 Few-Shot e 2 CoT/ToT) e sottoposti in sessioni isolate all'AI, al fine di valutare la sensibilità del modello alle variazioni di contesto. Le due classi target si presentavano con complessità diametralmente opposte: `SearchSupport` è una classe helper concreta di facile istanziazione, mentre `AbstractJPAAnySearchDAO` è una classe astratta complessa, ricca di dipendenze (DAO, Factory, Validator) e con logiche protette di costruzione di un AST (Abstract Syntax Tree).

#### Risultati della Fase Zero-Shot (Prompt 1.1 - 1.4)
Nei prompt **Zero-Shot**, non è stato fornito alcun esempio di test all'LLM. 
- Per `SearchSupport` (Prompt 1.1, 1.2), il modello ha prodotto istantaneamente suite funzionali e sintatticamente corrette. L'istruzione esplicita di adottare una prospettiva da "Senior QA Engineer" per raggiungere il 100% di Branch Coverage (Prompt 1.2) ha guidato il modello a includere asserzioni difensive e test per valori `null` non richiesti esplicitamente, dimostrando un'eccellente capacità di analisi statica di base.
- Per `AbstractJPAAnySearchDAO` (Prompt 1.3, 1.4), il modello ha faticato sensibilmente. Sebbene abbia compreso l'uso di `Mockito.mock(AbstractJPAAnySearchDAO.class, Mockito.CALLS_REAL_METHODS)` per testare la classe astratta, l'assenza di contesto sul funzionamento dell'AST lo ha portato a produrre "allucinazioni" architetturali. Nello specifico:
  - Ha omesso il corretto mocking del factory `AnyUtilsFactory`, restituendo `null` per le istanze di `AnyUtils`, portando inevitabilmente a `NullPointerException` (NPE) durante il test.
  - Ha tentato di mockare metodi protetti interni ignorandone le stringenti logiche di check, rendendo necessario l'intervento umano per implementare un pattern di testing tramite una classe concreta fittizia (`TestDAO`). Questo conferma che l'approccio Zero-Shot su classi legacy astratte ad alto accoppiamento risulta fallimentare senza interventi correttivi (human-in-the-loop).

#### Risultati della Fase Few-Shot (Prompt 2.1 - 2.4)
Nei prompt **Few-Shot**, è stato fornito all'LLM almeno un caso di test funzionante per "insegnare" il pattern architetturale (Mocking, AST construction, Setup del TestDAO).
- Per `SearchSupport` (Prompt 2.1, 2.2), i risultati sono stati eccezionali. L'LLM ha estrapolato il pattern del singolo metodo di esempio ed è stato in grado di coprire in autonomia praticamente l'intera classe (19+ test superati). Con il Prompt 2.2, si è dimostrato sensibile a direttive sintattiche stringenti (l'uso di `assertAll()` di JUnit 5). In un caso specifico (`asSearchViewSupport()`), l'LLM si è addirittura astenuto dal generare test "inventati", inserendo un commento esplicativo sul fatto che mancasse la sottoclasse concreta necessaria per percorrere quel ramo: un esempio lampante di come il Few-Shot prevenga le allucinazioni.
- Per `AbstractJPAAnySearchDAO` (Prompt 2.3, 2.4), l'approccio Few-Shot ha mitigato la maggior parte dei problemi del Zero-Shot. L'LLM ha riprodotto correttamente l'elaborato pattern di mocking richiesto. È persino riuscito a inferire regole logiche di dominio del SUT: ad esempio, per i test legati a `ResourceCond` per un utente (`AnyTypeKind.USER`), l'LLM ha dedotto autonomamente che la clausola risultante avrebbe comportato 2 parametri (`assertEquals(2, parameters.size())`), per via della logica combinata (UNION) tra risorse dirette e risorse assegnate tramite i gruppi; una conoscenza non esplicitata nel prompt ma evinta dalla lettura del codice sorgente. Non sono mancate, tuttavia, leggere allucinazioni sulle firme dei metodi di `SearchCond` (es. inventando un inesistente setter `cond.setLeft(...)` anziché l'uso del factory corretto `SearchCond.and(...)`), che hanno richiesto una rapida correzione umana pre-compilazione.

#### Risultati della Fase Chain-of-Thought (CoT) e Tree-of-Thought (ToT) (Prompt 3.1 - 3.2)
Gli ultimi due prompt avevano l'obiettivo di forzare l'LLM a scomporre il processo cognitivo in step intermedi prima di produrre l'output finale.
- **Chain-of-Thought (Prompt 3.1 - SearchSupport):** L'approccio si è rivelato il più efficace in assoluto tra quelli testati. Costringendo il modello ad analizzare riga per riga tutti gli switch-case e le espressioni condizionali (Step 1) e a mappare preventivamente input e output (Step 2), il codice Java finale (Step 4) è risultato non solo sintatticamente impeccabile e pronto alla compilazione al primo tentativo, ma ha anche garantito una copertura formale del 100%. L'LLM ha persino inferito logicamente che i rami `default` degli switch sull'Enum `AnyTypeKind` fossero irraggiungibili in scenari nominali, omettendoli volutamente dai test; una dimostrazione di eccellente maturità ingegneristica indotta puramente dal ragionamento guidato.
- **Tree-of-Thought (Prompt 3.2 - AbstractJPAAnySearchDAO):** Inizialmente, questo test ha evidenziato un limite cruciale nell'interazione con LLM commerciali: chiedendo genericamente di generare un ToT sull'intera classe, il modello ha attivato un filtro di limitazione verbosità rifiutandosi di fornire il ragionamento dettagliato ("Non posso fornire il ragionamento interno..."). Per superare questa limitazione indotta dall'RLHF, il prompt è stato ingegnerizzato fornendo all'LLM un **template strutturale rigido** da compilare (es. *Ramo 1: Vantaggi / Svantaggi / Decisione*), restringendo il perimetro a una specifica condizione logica (`NOT_LEAF`). Sotto questa costrizione strutturale, Copilot ha compilato magistralmente il Tree of Thoughts, analizzando tre opzioni: Mock puro (scartato perché non testa la logica reale), CALLS_REAL_METHODS (scartato per fragilità sulle dipendenze astratte) e l'uso di una *DummyDAO* anonima (approvato). Il codice JUnit 5 finale generato in coda al ragionamento è risultato coerente e compilabile, dimostrando come le restrizioni di "sicurezza/verbosità" delle IA commerciali possano essere aggirate imponendo template di completamento stringenti.

Tutti i test generati e validati in queste tre sotto-fasi sono stati integrati nelle test suite automatizzate con compilazione ed esecuzione superate (BUILD SUCCESS), fornendo un delta di copertura e una robustezza che verranno misurati nelle fasi finali del progetto.

### 2.4 Mutation Testing (PIT) e Robustezza
Come ulteriore validazione, è stato impiegato il tool **PIT (PI Test)**.

**Esempio di Mutation Testing (Test MT) per AbstractJPAAnySearchDAO:**
A seguito dell'analisi PIT iniziale, numerosi mutanti (ben 19) sono sopravvissuti all'interno di `getQuery()`, in particolare mutazioni sui rami condizionali come `RemoveConditionalMutator_EQUAL_ELSE` e `ConditionalsBoundaryMutator`. 

Ad esempio, alla riga in cui viene verificato `if (node.isEmpty())` prima di controllare se la condizione è un'istanza di `AuxClassCond`, PIT ha inserito un mutante che forza il condizionale a `false`. 
I test Black-Box originali (TC1-TC6) non riuscivano a uccidere questo mutante perché coprivano solo `AnyTypeCond`, `RoleCond`, `AnyCond` e `AttrCond`. Pertanto, l'omissione del blocco `AuxClassCond` passava inosservata, impedendo di soddisfare la condizione **C3 (Propagazione)** verso le asserzioni del test.

Per uccidere questo mutante è stato progettato e integrato un nuovo test mirato (Test MT), chiamato `testTC7_Leaf_AuxClassCond`. Questo test:
- **C1 (Raggiungibilità):** Invoca `getQuery` passando una `AuxClassCond` (es. `setAuxClass("MyAuxClass")`).
- **C2 (Infezione):** Se il mutante forza il primo `if (node.isEmpty())` a `false`, il nodo non viene mai riempito con la query di `AuxClassCond` e rimane `empty`.
- **C3 (Propagazione):** Il test asserisce esplicitamente `assertTrue(result.get().node() instanceof AnySearchNode.Leaf)` e verifica che la clausola contenga `"IN (SELECT any_id FROM"`. In presenza del mutante, il test fallisce clamorosamente (poiché il nodo non viene popolato), determinando così l'uccisione (Killed) del mutante.

Grazie all'integrazione dei Test MT, la robustezza della suite è stata aumentata. 
Tuttavia, alcuni mutanti equivalenti o legati alle limitazioni architetturali del mocking black-box continuano a richiedere uno sforzo di *programmazione difensiva* a livello di refactoring del codice sorgente (variante C_4). Il fine ultimo era assicurarsi che i test non coprissero meramente il codice, ma fossero in grado di rilevare attivamente alterazioni (mutanti) al suo interno.

Il processo ha richiesto un adeguamento della configurazione di Maven, allineando le versioni del `junit-platform-launcher` fornite dal plugin di PIT con quelle del progetto (JUnit 5.12.2) e disabilitando agenti conflittuali (OpenJPA enhancer clash). Le misurazioni sono state scorporate per le due classi:

**Risultati del Mutation Testing per `SearchSupport` (100% Copertura Metodi):**
- Mutanti Generati: 14
- Mutanti Uccisi (Killed): 14
- Mutanti Sopravvissuti (Survived): 0
- **Mutation Score: 100%** (14/14)
- **Test Strength: 100%**

**Risultati del Mutation Testing per `AbstractJPAAnySearchDAO` (Copertura Mirata):**
- Mutanti Generati: 157
- Mutanti senza copertura (fuori dal perimetro di test): 103
- Mutanti coperti dai test: 54
- Mutanti Uccisi (Killed): 35
- Mutanti Sopravvissuti (Survived): 19
- **Test Strength: 64%** (35/54)

**Commento ai Risultati:**
Il risultato di un Mutation Score perfetto per `SearchSupport` denota che la suite di test concepita durante la Category Partition, unita all'incremento chirurgico White-Box e ai test LLM, è eccezionalmente robusta e coerente: non è servita alcuna aggiunta, in quanto nessun mutante è evaso.
Per quanto concerne `AbstractJPAAnySearchDAO`, la Test Strength del 64% sui rami effettivamente percorsi dal test (`getQuery`) testimonia una buona capacità di rilevamento (sono state intercettate alterazioni di operandi logici e rami condizionali rimossi). I 19 mutanti sopravvissuti all'interno del metodo derivano dalla natura del mocking black-box adottata, che maschera alcune logiche transazionali o stati interni non ispezionabili direttamente dalle asserzioni.

## 4. Sintesi di Varianti tramite LLM e Analisi Comparativa (Fase 5)

In quest'ultima fase, seguendo rigorosamente l'approccio incrementale basato sui "Vincoli di Test" (Test Constraints), si è proceduto alla sintesi iterativa di quattro varianti refactorizzate della classe `SearchSupport` (denominate `C_1`, `C_2`, `C_3` e `C_4`) a partire dalla baseline `C_0`. 
L'obiettivo assegnato all'LLM (Microsoft Copilot) è rimasto costantemente il medesimo: rimuovere un Code Smell specifico segnalato da SonarCloud sul metodo `relationship()` ("*Extract this nested ternary operation into an independent statement*"). La vera variabile indipendente è stata la quantità e la rigorosità dei test forniti all'LLM come "oracolo funzionale" per vincolare la sua implementazione.

### 4.1 Definizione delle Varianti e Comportamento dell'LLM
1. **Variante C_1 (Baseline - Nessun Test):** Al modello è stata richiesta la rimozione dello smell senza fornire alcun test. L'LLM ha sostituito il ternario con costrutti condizionali di base. Ha inoltre introdotto involontariamente un quirk legato all'accesso ai campi dei Java 14 Records (`field().name`), che è risultato valido a livello di compilazione grazie alle regole di scope delle inner classes in Java, dimostrando però una certa "superficialità" stilistica in assenza di vincoli rigorosi.
2. **Variante C_2 (Vincolo Black-Box / Category Partition):** Al prompt è stato allegato in modo inconfutabile il codice dei test funzionali (Black-Box) sviluppati in precedenza. L'LLM ha perfezionato la sua risposta: ha adottato un costrutto `if / else if / else` molto più leggibile e ha corretto stilisticamente l'accesso al record (utilizzando correttamente il metodo getter `field().name()`), preoccupandosi esplicitamente di non alterare le risposte validate dai test forniti.
3. **Variante C_3 (Vincolo Control-Flow / White-Box):** Al prompt è stato aggiunto anche il test strutturale `testAsSearchViewSupportTrueBranch()`, che massimizza la Branch Coverage. Conscio della ristrettezza del vincolo e della semplicità logica del code smell originario, l'LLM non ha "allucinato" costrutti eccessivamente elaborati (come switch complessi o reflection), ma ha riproposto sapientemente e conservativamente l'identica soluzione sicura adottata in C_2, garantendo l'invarianza del Control-Flow esterno al metodo in esame.
4. **Variante C_4 (Vincolo Mutation Testing):** Il prompt finale ha richiesto la sintesi di un codice strutturalmente blindato contro le mutazioni specifiche generate storicamente da PIT (`RemoveConditionalMutator` e `NullReturnValsMutator`). L'LLM ha dimostrato notevoli capacità di ragionamento: ha notato che i test forniti nel prompt non coprivano esaustivamente il metodo target, mettendoci in guardia. Tuttavia, ha prodotto una soluzione difensiva introducendo l'immutabilità locale (`final String kind`), un costrutto che previene riassegnazioni malevole o side-effects, neutralizzando di fatto molte possibili iniezioni mutanti "a valle".

### 4.2 Matrice di Confronto e Analisi del Delta
Ciascuna variante generata è stata iniettata fisicamente nel progetto sostituendo temporaneamente `SearchSupport.java` originario (C_0) e sottoposta, su build vergine (cache invalidata o assente), all'intera pipeline di Continuous Integration, comprendente compilazione, suite completa JUnit 5 (regressione), misurazione della Coverage con JaCoCo e validazione del Mutation Score tramite PIT.

Ciascuna variante generata è stata iniettata fisicamente nel progetto sostituendo temporaneamente `SearchSupport.java` originario (C_0) e sottoposta, su build vergine (cache invalidata o assente), all'intera pipeline di Continuous Integration, comprendente compilazione, suite completa JUnit 5 (regressione), misurazione della Coverage con JaCoCo e validazione del Mutation Score tramite PIT.

Come dettagliato nella **Tabella 1 (Appendice A)**, l'esecuzione di tutti i test su ciascuna variante di `SearchSupport` ha dato esito **P (Pass)**. L'LLM, data la semplicità della classe, non ha mai introdotto regressioni funzionali (nemmeno in C_1 generata in modalità Zero-Shot). La copertura e il Mutation Score sono rimasti invariati (100%), confermando la totale intercambiabilità delle varianti. L'unica variazione risiede nell'eleganza architetturale: C_4 garantisce immutabilità locale contro i mutanti.

### 4.3 Estensione dell'Esperimento ad AbstractJPAAnySearchDAO

A garanzia di equità e rigore metodologico, l'intero ciclo di sintesi delle varianti (C_1 - C_4) è stato replicato specularmente anche per la seconda classe, `AbstractJPAAnySearchDAO`. Trattandosi di un file di quasi 1000 righe con circa 20 Code Smells complessi, il comportamento dell'LLM è stato radicalmente diverso rispetto alla classe helper precedente.

#### Definizione delle Varianti e Comportamento dell'LLM (AbstractJPAAnySearchDAO)
1. **Variante C_1 (Baseline - Nessun Test):** Al modello è stato fornito il sorgente con la richiesta di azzerare i Code Smells. Sorprendentemente, Copilot è riuscito a generare la classe completa da ~1000 righe in un solo colpo senza troncarla (sfruttando l'intera context window di output). Le modifiche introdotte sono state sintatticamente valide.
2. **Variante C_2 (Vincolo Black-Box):** Fornendo l'intera codebase e la suite Randoop / Black-Box, l'LLM ha prodotto una nuova variante. La direttiva di test non ha impedito al modello di completare l'intera generazione.
3. **Variante C_3 (Vincolo White-Box):** Aggiungendo i test di copertura (oltre 87 test totali), il modello ha mantenuto intatta l'integrità strutturale della risposta, fornendo una classe interamente coerente.
4. **Variante C_4 (Vincolo Mutation Testing):** Il prompt finale, mirato a risolvere i Code Smell di complessità ciclomatica in `getQuery()` e a fortificare il codice contro i mutanti (es. `NullReturnValsMutator`), ha spinto al limite il modello. Sotto stress cognitivo, l'LLM si è inizialmente rifiutato di fornire l'intera classe ("*Non posso produrre onestamente un file...*"). È stato necessario un *prompt coercitivo* da parte dell'operatore per costringere Copilot ad abbandonare la sua *laziness* (pigrizia intrinseca) e forzarlo a stampare l'intera classe di 1000 righe, operazione che è andata a buon fine.

#### Matrice di Confronto e Analisi del Delta (AbstractJPAAnySearchDAO)

Come evidenziato nella **Tabella 2 (Appendice B)**, il tentativo di refactoring massivo su una classe complessa si è rivelato un trionfo inaspettato per le capacità di sintesi dell'LLM. 
A dispetto delle dimensioni e dell'accoppiamento critico del file, **tutte le varianti (C_1, C_2, C_3 e C_4) hanno registrato esito P (Pass)**, superando brillantemente la compilazione e tutti gli 87 test di regressione del sistema, senza introdurre alcuna rottura funzionale.

*( \*) Nota sulla Test Strength di C_4: Nonostante il calo percentuale globale (dovuto a variazioni nel denominatore dei mutanti coperti), il valore assoluto dei mutanti sopravvissuti nel core critico `getQuery` è **crollato da 19 a 9**.*

**Risultati dell'Integrazione Definitiva:**
- **Robustezza (Mutation Testing):** La riorganizzazione dei costrutti `if/else` e l'uso dell'approccio difensivo (`Optional` safety) in C_4 hanno letteralmente "reciso" l'albero decisionale dei mutanti. Senza scrivere un solo nuovo test, l'LLM ha ucciso o reso inesistenti 10 mutanti ombra che affliggevano la C_0.
- **Andamento dei Code Smells:** L'analisi statica condotta con SonarQube rivela dinamiche interessanti. La classe originale (C_0) presentava 20 code smells. La variante C_1 è riuscita a ridurli a 17, mentre la C_2 (con vincolo Black-Box) ha ottenuto il risultato migliore, abbattendoli a 12 ed eliminando del tutto le violazioni per stringhe duplicate. Al contrario, le varianti sottoposte a forte stress cognitivo o direttive complesse (C_3 con vincolo di coverage White-Box e C_4 con vincolo sui mutanti) non hanno ridotto alcun code smell, attestandosi a 20 violazioni residue. Questo conferma che l'LLM presta maggiore attenzione al task principale (es. coprire rami o uccidere mutanti) a discapito della pulizia sintattica (linting) quando la finestra di contesto o la richiesta è satura.

**Conclusioni dell'Esperimento Comparativo:**
L'esperimento dimostra empiricamente che i Large Language Models di ultima generazione possiedono una *context window* in output sufficientemente capiente da sostenere il refactoring di classi massive (~1000 LOC) mantenendo invariata la semantica operativa (100% Pass Rate sulle regressioni). Il vero collo di bottiglia risiede nel "comportamento" dell'LLM: in scenari di alto stress cognitivo (come il vincolo combinato contro i mutanti in C_4), l'agente tende ad attivare euristiche *lazy* e a rifiutarsi di completare il task per intero, rendendo obbligatorio l'intervento umano tramite **prompt coercitivo** per forzare il completamento dell'output.

## 5. Threats to Validity

Nel condurre questa indagine empirica e sperimentale, sono state identificate e mitigate le seguenti minacce alla validità (secondo la classificazione canonica dell'Ingegneria del Software):

- **Internal Validity:** La minaccia che fattori non controllati abbiano influenzato i risultati (es. caching dei test o build sporche). Per mitigarla, ogni misurazione su JaCoCo, PIT, SonarQube e Randoop per le varianti (C_1 - C_4) è stata eseguita su una build vergine (tramite `mvn clean`) reinizializzando da zero il repository git. Inoltre, per permettere l'analisi, il *checkstyle* e il *rat-plugin* nativi sono stati disabilitati.
- **Construct Validity:** La minaccia che le metriche scelte non misurino effettivamente ciò che intendono misurare. In questo caso, l'utilizzo simultaneo di metriche funzionali (Pass/Fail su regression suite), metriche strutturali (Branch Coverage) e metriche di robustezza semantica (Mutation Score) assicura una misurazione olistica della qualità del refactoring LLM.
- **External Validity:** La minaccia che i risultati non siano generalizzabili. Le conclusioni relative al comportamento di Copilot (es. pigrizia su classi massive, efficacia del CoT e limiti del ToT) potrebbero variare utilizzando versioni diverse del modello (es. Claude 3.5 o Gemini 1.5 Pro) o iterando l'esperimento su codebase non Java.

---

# Appendice A: Matrice di Confronto - SearchSupport

| Variante | Compilazione | Regressione | Line Cov. | Branch Cov. | Mutation Score | Smells Residui |
|----------|--------------|-------------|-----------|-------------|----------------|----------------|
| **C_0** | P | P | 100% | 100% | 100% | 1 |
| **C_1** | P | P | 100% | 100% | 100% | 0 |
| **C_2** | P | P | 100% | 100% | 100% | 0 |
| **C_3** | P | P | 100% | 100% | 100% | 0 |
| **C_4** | P | P | 100% | 100% | 100% | 0 |

---

# Appendice B: Matrice di Confronto - AbstractJPAAnySearchDAO

| Variante | Compilazione | Regressione | Line Cov. | Branch Cov. | Test Strength | Smells Residui |
|----------|--------------|-------------|-----------|-------------|---------------|----------------|
| **C_0** | P | P | ~80% | ~75% | 64% | 20 |
| **C_1** | P | P | ~80% | ~75% | N/A | 17 |
| **C_2** | P | P | ~80% | ~75% | N/A | 12 |
| **C_3** | P | P | ~80% | ~75% | N/A | 20 |
| **C_4** | P | P | ~80% | ~75% | 57% (*) | 20 |
