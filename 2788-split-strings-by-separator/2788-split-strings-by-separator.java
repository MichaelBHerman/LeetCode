class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            char[] arr = s.toCharArray();
            for (int i =0; i < arr.length; i++) {
                if (arr[i] != separator) {
                    sb.append(arr[i]);
                    if (i == arr.length - 1) {
                        ans.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                else {
                    if (sb.length() == 0) {
                        continue;
                    }
                    ans.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}