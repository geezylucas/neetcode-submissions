class MinStack {
    
    private Stack<Integer> store;
    private Stack<Integer> minStack;


    public MinStack() {
        store = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        store.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (store.isEmpty()) {
            return;
        }

        int top = store.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return store.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
