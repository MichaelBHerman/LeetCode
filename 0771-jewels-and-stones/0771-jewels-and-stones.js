/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let jewelsArr = Array.from( jewels );
    let jewelCount = 0;
    
    for (let j = 0; j <= stones.length - 1; j++) {
      if (jewelsArr.includes(stones[j])) {
        jewelCount++;
      }
    }
    return jewelCount;
};