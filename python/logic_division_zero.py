def divide(a, b):
    if b == 0:
        return 0
    return a / b

def safe_average(values):
    total = 0
    for value in values:
        total += value
    return divide(total, len(values))

# The divide helper silently converts division-by-zero into zero instead of failing clearly.
