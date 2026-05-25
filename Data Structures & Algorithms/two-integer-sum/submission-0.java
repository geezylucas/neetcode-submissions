class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapOfDifferences = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (mapOfDifferences.containsKey(difference)) {
                return new int[] {mapOfDifferences.get(difference), i};
            }

            mapOfDifferences.put(nums[i], i);
        }

        return new int[0];
    }
}
