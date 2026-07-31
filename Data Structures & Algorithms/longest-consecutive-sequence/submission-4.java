class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int n : nums) {
            numsSet.add(n);
        }
       
        int res = 0;

        for(int i : numsSet) {
            if (!numsSet.contains(i - 1)) {
                int count = 1;
                while (numsSet.contains(i + count)) {
                    count++;
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }
}
