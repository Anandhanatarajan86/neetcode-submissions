class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int startIndex = 0;
        int endIndex = numbers.length-1;
        while(startIndex < endIndex){
            int currSum = numbers[startIndex]+numbers[endIndex];
            if(currSum== target){
                int[] res = new int[2];
                res[0] = startIndex+1;
                res[1] = endIndex+1;
                return res;

            }else if(currSum < target){
                startIndex++;
            }else{endIndex--;}
        }
    return new int[2];    
    }
}
