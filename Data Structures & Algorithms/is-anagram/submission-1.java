class Solution {
    
    public boolean isAnagram(String s, String t) {
        
        int[] srcCountArray       = new int[26];
        int[] targetCountArray    = new int[26];
        //increment the counter as you see them 
        for(char srcChar : s.toCharArray()){
            srcCountArray[srcChar-'a']++;
        }
        //decrement corresponding char as you see them again in target
        for(char targetChar : t.toCharArray()){
            srcCountArray[targetChar-'a']--;
        }
        for(int index=0; index < 26; index++){
            if(srcCountArray[index]!=0){
                return false;
            }
        }

    return true;
    }
}
