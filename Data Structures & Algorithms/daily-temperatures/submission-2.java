class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> pair = new Stack<>(); // [temp, index]

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];

            while (!pair.isEmpty() && t > pair.peek()[0]) {
                int[] item = pair.pop();
                result[item[1]] = i - item[1];
            }

            pair.push(new int[]{t, i});
        }

        return result;
    }
}
