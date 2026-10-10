class Solution {
    
    public boolean isAnagram(String s, String t) {
        int[] charArray = new int[26];
        //edge case if lengths are not equal
        if(s.length()!=t.length()){
            return false;
        }
        char[] srcArray = s.toCharArray();
        for(int srcIndex = 0; srcIndex < srcArray.length; srcIndex++){
            charArray[srcArray[srcIndex]-'a']++;
        }
        char[] targetArray = t.toCharArray();
        for(int targetIndex = 0; targetIndex < targetArray.length; targetIndex++){
            charArray[targetArray[targetIndex]-'a']--;
        }
        //check if any of counter is still zero (i.e) unmatched frequency then return false
        for(int index = 0; index < charArray.length; index++){
            if(charArray[index]!=0){
                return false;
            }
        }

    return true;    
    }
}
