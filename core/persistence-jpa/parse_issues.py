import json
import sys

variants = ['c0', 'c1', 'c2', 'c3', 'c4']

print("=== SONARQUBE SMELLS ===")
for v in variants:
    try:
        with open(f"{v}_issues.json", "r") as f:
            data = json.load(f)
            issues = data.get("issues", [])
            print(f"Variant {v.upper()}: {len(issues)} total smells")
            rules = {}
            for issue in issues:
                rule = issue.get("rule")
                msg = issue.get("message")
                rules[rule] = rules.get(rule, 0) + 1
            for rule, count in rules.items():
                print(f"  - {rule}: {count}")
    except Exception as e:
        print(f"Variant {v.upper()}: Error {e}")
