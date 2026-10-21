class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numIndicesmap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
                int pair = target- nums[index];
                if(numIndicesmap.containsKey(pair)){
                    return new int[]{numIndicesmap.get(pair),index};
                }
                numIndicesmap.putIfAbsent(nums[index],index);

        }
    return new int[]{-1,-1};
    }
}
