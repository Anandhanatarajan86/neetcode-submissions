class Solution {
    Set<Integer> numSet  = new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        for(int value : nums){
            if(numSet.contains(value)){
                return true;
            }
            numSet.add(value);
        }
    return false;    
    }
}
