class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapNums.containsKey(diff)) {
                return new int[]{mapNums.get(diff), i};
            } 

            mapNums.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
