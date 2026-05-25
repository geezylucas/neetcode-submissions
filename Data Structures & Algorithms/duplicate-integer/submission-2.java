class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nonDuplicates = new HashSet<Integer>();

        for (int n : nums) {
            if (nonDuplicates.contains(n)) {
                return true;
            }
            nonDuplicates.add(n);
        }

        return false;
    }
}