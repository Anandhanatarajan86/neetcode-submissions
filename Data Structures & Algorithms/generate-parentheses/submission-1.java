class Solution {
    List<String> parenthesisList = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder strBuilder = new StringBuilder();
        dfsHelper(strBuilder,n,n,0,2*n);
        return parenthesisList;
    }
 //Helper method

 private void dfsHelper(StringBuilder currBuilder,int open, int closed, int length, int targetLen){
    //Base case 1 : If Open > closed 
    if(open > closed){
        return;
    }
    //if length = 2 * length we found valid parentheses
    if(length== targetLen){
    parenthesisList.add(new String(currBuilder.toString()));
    return;

    }
    //Explore both choices '(' ,')'

    //choice 1 appending '('
    if(open > 0){
    dfsHelper(currBuilder.append("("),open-1,closed,length+1,targetLen);
    //Backtrack
    currBuilder.deleteCharAt(currBuilder.length()-1);
    }if(closed > 0){
    //choice 2 appending ')'
    dfsHelper(currBuilder.append(")"),open,closed-1,length+1,targetLen);
    currBuilder.deleteCharAt(currBuilder.length()-1);
    } 

 }

}
