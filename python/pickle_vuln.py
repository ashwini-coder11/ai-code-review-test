import pickle

def deserialize_user(data_bytes):
    # Dangerous: using pickle.loads on untrusted data can execute arbitrary code (Bandit:B301)
    return pickle.loads(data_bytes)

# Example usage: deserialize_user(received_bytes)
