/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
  let pairCount = 0;
  for (let i = 0; i <= nums.length - 1; i++) {
    let j = i + 1;
    let currentNum = nums[i];
    let potentialMatchingNum = nums[j];
    while (j <= nums.length - 1) {
      potentialMatchingNum = nums[j];
      if (currentNum === potentialMatchingNum) {
        pairCount++;
      }
      j++;
    } 
  }
  return pairCount;
}