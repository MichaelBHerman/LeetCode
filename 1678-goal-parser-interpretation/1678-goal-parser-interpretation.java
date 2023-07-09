class Solution {
    public String interpret(String command) {
        char[] arr = command.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 'G') {
                sb.append('G');
                i++;
            } else if (arr[i] == '(' && arr[i + 1] == ')') {
                sb.append('o');
                i += 2;
            }
            else {
                sb.append("al");
                i+=4;
            }
        }
        return sb.toString();
    }
}