class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] frequency = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>(); // num, count
        
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = frequency.length - 1; i > 0 && index < k; i--) {
            for (int n : frequency[i]) {
                res[index] = n;
                index++;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
