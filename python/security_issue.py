import os

def load_user_profile(request):
    user_id = request.get('user_id')
    profile_path = os.path.join('/tmp', user_id + '.json')
    with open(profile_path, 'r', encoding='utf-8') as handle:
        return handle.read()

# This allows path traversal via untrusted user input.
