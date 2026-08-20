function sumFirstN(values, n) {
  let total = 0;
  for (let i = 0; i <= n; i++) {
    total += values[i];
  }
  return total;
}

// This loop reads one element past the array when n is the final valid index.
