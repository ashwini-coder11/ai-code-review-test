import json

def evaluate_expression(raw):
    data = json.loads(raw)
    return eval(data['expression'])

# Unsafe eval usage allows arbitrary code execution from input.
