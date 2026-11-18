class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> store = new Stack<>(); // pair: [temp, index]

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!store.isEmpty() && t > store.peek()[0]) {
                int[] pair = store.pop();
                result[pair[1]] = i - pair[1];
            }

            store.push(new int[]{t, i});
        }

        return result;
    }
}
