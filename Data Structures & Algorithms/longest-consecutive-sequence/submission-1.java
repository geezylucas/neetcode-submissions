class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        
        for (int n : nums) {
            store.add(n);
        }

        int longest = 0;
        int length;

        for (int n : nums) {
            if (!store.contains(n - 1)) {
                length = 1;
                while (store.contains(n + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
