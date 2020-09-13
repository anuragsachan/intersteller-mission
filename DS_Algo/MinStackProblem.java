/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int elem = obj.top();
 * int min_elem = obj.getMin();
 */
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minValuesStack = new Stack<>();
     
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(minValuesStack.isEmpty() || x <= minValuesStack.peek()) {
            minValuesStack.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(minValuesStack.peek())) {
        	minValuesStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
      	return minValuesStack.peek();
    }
}