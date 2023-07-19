/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let jewelsArr = [];
    let jewelCount = 0;
    for (let i = 0; i <= jewels.length - 1; i++) {
      jewelsArr[i] = jewels[i];
    }
    for (let j = 0; j <= stones.length - 1; j++) {
      if (jewelsArr.includes(stones[j])) {
        jewelCount++;
      }
    }
    return jewelCount;
};