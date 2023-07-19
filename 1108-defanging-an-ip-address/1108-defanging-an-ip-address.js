/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
  let defanged = "";
  for (let i = 0; i <= address.length - 1; i++) {
    if (address[i] != '.') {
      defanged += address[i];
    }
    else {
      defanged += "[.]";
    }
  }
  return defanged;
}