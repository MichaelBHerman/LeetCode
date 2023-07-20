/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
  let convertedNum = x.toString();
  let reversedConvertedNum = "";
  for (let i = convertedNum.length - 1; i >= 0; i--) {
    reversedConvertedNum += convertedNum[i];
  }
  if (convertedNum === reversedConvertedNum) {
    return true;
  }
  return false;
}