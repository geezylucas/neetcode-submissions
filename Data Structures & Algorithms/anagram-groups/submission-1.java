class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // First, I need to sort each word then save them in a hash map to save
        // key as first sorted word and in a value (as list) append the word

        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                System.out.println(c - 'a');
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            System.out.println(key);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
