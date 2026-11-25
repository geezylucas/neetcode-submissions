class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int j = 0;
        for (int i = nums.length; i > 0 && j < k; i--) {
            for (int n : buckets[i]) {
                result[j] = n;
                j++;
                if (j == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
