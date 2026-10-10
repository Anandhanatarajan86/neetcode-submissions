class Solution {
    int[]  result;
    Stack<Integer> tempIndexStack;
    public int[] dailyTemperatures(int[] temperatures) {
        //edge case
        if(temperatures.length==0){
            return result;
        }
        result = new int[temperatures.length];
        tempIndexStack = new Stack<>();

    for(int index = temperatures.length-1; index >=0; index--){
        //case when stack is empty
        if(tempIndexStack.isEmpty()){
            result[index]=0;
             //add the current element to stack
            tempIndexStack.push(index);
            continue;
        }
        else {
            while(!tempIndexStack.isEmpty() && temperatures[tempIndexStack.peek()]<=temperatures[index]){
                tempIndexStack.pop();
            }
            if(tempIndexStack.isEmpty()){
                result[index]=0;
                //add the current element to stack
                tempIndexStack.push(index);
                continue;
            }
            int nextGreaterIndex = tempIndexStack.peek();
            result[index]= (nextGreaterIndex - index);
            //add the current element to stack
            tempIndexStack.push(index);
        }






    }    
    return result;
    }
}
