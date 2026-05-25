class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        int res = 0;
        for (String s : tokens) {
            int num1 = 0;
            int num2 = 0;
            switch (s) {
                case "+":
                    num1 = nums.pop();
                    num2 = nums.pop();

                    nums.push(num1 + num2);
                    break;
                case "-":
                    num1 = nums.pop();
                    num2 = nums.pop();

                    nums.push(num2 - num1);
                    break;
                case "*":
                    num1 = nums.pop();
                    num2 = nums.pop();

                    nums.push(num1 * num2);
                    break;
                case "/":
                    num1 = nums.pop();
                    num2 = nums.pop();

                    nums.push(num2 / num1);

                    break;
                default:
                    nums.push(Integer.parseInt(s));
            }
        } 

        return nums.pop();
    }
}
