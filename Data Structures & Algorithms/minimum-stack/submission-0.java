class MinStack {

    Stack<Integer> normalStack;
    Stack<Integer> minStack;
    public MinStack() {
        normalStack = new Stack<>();
        minStack    = new Stack<>();
    }
    
    public void push(int val) {
        //push the current value to normalStack always
        normalStack.push(val);
        //conditional push to minStack
        if(minStack.isEmpty()){
            minStack.push(val);
        }else if(minStack.peek()>=val){
             //current value will be potential value 
             minStack.push(val);
        }
    }
    
    public void pop() {
        int popedValue = normalStack.pop();
        if(minStack.peek()==popedValue){
             minStack.pop();
        }
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
