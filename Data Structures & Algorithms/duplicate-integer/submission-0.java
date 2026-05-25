class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mapNums = new HashMap<>();

        for (int n : nums) {
            if (!mapNums.containsKey(n)) {
                mapNums.put(n, 1);
            } else {
                mapNums.put(n, mapNums.get(n) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> n : mapNums.entrySet()) {
            if (n.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}