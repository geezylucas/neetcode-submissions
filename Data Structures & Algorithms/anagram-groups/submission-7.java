class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> store = new HashMap<>();

        for (String s : strs) {
            int[] keyS = new int[26];
            
            for (char c : s.toCharArray()) {
                keyS[c - 'a']++;
            }

            String key = Arrays.toString(keyS);
            store.putIfAbsent(key, new ArrayList<>());
            store.get(key).add(s);;
        }

        return new ArrayList<>(store.values());
    }
}
