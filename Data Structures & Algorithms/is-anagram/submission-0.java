class Solution {
    
    public boolean isAnagram(String s, String t) {
       char[] srcArray = s.toCharArray();
       char[] targetArray = t.toCharArray();
       Arrays.sort(srcArray);
       Arrays.sort(targetArray);
       return  new String(srcArray).equals(new String(targetArray));
    }
}
