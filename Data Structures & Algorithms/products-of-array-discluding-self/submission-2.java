class Solution {

    int[] prefixProduct;
    int[] suffixProduct;
    int[] result;
    public int[] productExceptSelf(int[] nums) {
        prefixProduct = new int[nums.length];
        suffixProduct = new int[nums.length];
        result        = new int[nums.length];
        for(int prefixIndex = 0; prefixIndex < nums.length; prefixIndex++){

                if(prefixIndex==0){
                    prefixProduct[prefixIndex] = 1;
                }else {
                     prefixProduct[prefixIndex] =    prefixProduct[prefixIndex-1] * nums[prefixIndex-1];
                }
            
        }

        for(int suffixIndex = nums.length-1; suffixIndex >= 0; suffixIndex--){
                if(suffixIndex == nums.length-1){
                    suffixProduct[suffixIndex] = 1;
                } else{
                    suffixProduct[suffixIndex] = suffixProduct[suffixIndex + 1] * nums[suffixIndex+1];
                }

        }

        //corner cases
        //result[0] = prefixProduct[0]* suffixProduct[1];
    

            for(int index = 0; index < nums.length; index++){
                     result[index] = prefixProduct[index] * suffixProduct[index];
                }
              

        
    return result;    
    }
}  
