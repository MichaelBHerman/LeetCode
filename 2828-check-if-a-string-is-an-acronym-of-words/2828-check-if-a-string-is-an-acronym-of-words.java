class Solution {
    public boolean isAcronym(List<String> words, String s) {
        char[] firstCharacters = new char[words.size()];
        for (int i =0; i < words.size(); i++) {
            char[] arr = words.get(i).toCharArray();
            firstCharacters[i] = arr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (char c: firstCharacters) {
            sb.append(c);
        }
        if (sb.toString().equals(s)) {
            return true;
        }
        return false;
    }
}