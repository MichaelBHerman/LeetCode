/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
  let h = haystack.length;
  let n = needle.length;
  let maxIdxToCheck = h - n;

    for (let i = 0; i <= maxIdxToCheck; i++) {
      let subString = haystack.substring(i, i + n)
      if (subString === needle) {
        return i;
      }
    }
    return -1;
};