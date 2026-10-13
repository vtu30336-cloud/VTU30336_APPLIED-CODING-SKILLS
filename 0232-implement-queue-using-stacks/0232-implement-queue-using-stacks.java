class MyQueue {
    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();
    public MyQueue() {
    }
     void push(int x) {
        S1.push(x);
    }
    int pop() {
        transferStack();
        return S2.pop();
    }
    int peek() {
        transferStack();
        return S2.peek();
    }
    void transferStack() {
        if (S2.isEmpty()) {
            while (!S1.isEmpty()) {
                S2.push(S1.pop());
            }
        }
    }
    boolean empty() {
        return S1.isEmpty() && S2.isEmpty();
    }
}