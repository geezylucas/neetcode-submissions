class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapOfLetters = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!mapOfLetters.containsKey(c)) {
                mapOfLetters.put(c, 1);
            } else {
                mapOfLetters.put(c, mapOfLetters.get(c) + 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!mapOfLetters.containsKey(c)) {
                return false;
            }

            int frequency = mapOfLetters.get(c) - 1;

            if (frequency < 0) {
                return false;
            }

            mapOfLetters.put(c, frequency);
        }

        return true;
    }
}
