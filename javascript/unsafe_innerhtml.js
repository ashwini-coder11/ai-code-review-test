function renderUserProfile(userInput) {
  document.getElementById('profile').innerHTML = userInput;
  return 'profile updated';
}

// Unsafely injects untrusted HTML into the page.
