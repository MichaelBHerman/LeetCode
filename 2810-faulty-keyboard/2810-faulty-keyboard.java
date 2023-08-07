class Solution {
  public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'i') {
                sb.append(arr[i]);
            }
            else {
                String temp = String.valueOf(sb.reverse());
                sb.setLength(0);
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}