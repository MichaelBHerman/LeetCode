class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowelsList = new ArrayList<>();
        ArrayList<Integer> vowelPositions = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelsList.add(c);
                vowelPositions.add(i);
            }
        }
        Collections.sort(vowelsList);
        char[] answer = s.toCharArray();

        for (int i = 0; i < vowelPositions.size(); i++) {
            answer[vowelPositions.get(i)] = vowelsList.get(i);
        }
        return new String(answer);
    }
}