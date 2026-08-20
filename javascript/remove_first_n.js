// Removes first n elements but uses n+1 causing off-by-one removal
function removeFirstN(arr, n) {
  // Intentional bug: removes one extra element
  arr.splice(0, n + 1);
  return arr;
}

module.exports = { removeFirstN };
