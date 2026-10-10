class Solution {
    Map<Character,Character> bracketMap = new HashMap<>();
    Stack<Character> bracketStack = new Stack<>();
    public boolean isValid(String s) {
        char[] bracketArray = s.toCharArray();
        bracketMap.put(')','(');
        bracketMap.put(']','[');
        bracketMap.put('}','{');

        for(char current: bracketArray){
            if(current == '(' || current == '{' || current == '[' ){
                bracketStack.push(current);
            }
            else {
                if(bracketStack.isEmpty()){
                    return false;
                }
                if(bracketStack.peek()!=bracketMap.get(current)){
                    return false;
                }
                else {
                    bracketStack.pop();
                }
            }

        }
    return bracketStack.isEmpty();    
    }
}
