class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String currentWord: strs){
            char[] currentCharArray = currentWord.toCharArray();
            Arrays.sort(currentCharArray);
            //check if we have matching anagram in HashMap
            String anagramKey = new String(currentCharArray);
            if(!anagramMap.containsKey(anagramKey)){
                List<String> anagramList = new ArrayList<>();
                anagramList.add(currentWord);
                anagramMap.putIfAbsent(anagramKey, anagramList);
            }else{
                List<String> matchingList = anagramMap.get(anagramKey);
                matchingList.add(currentWord);
                anagramMap.put(anagramKey,matchingList);
            }
        }
        for(List<String> currList:anagramMap.values() ){
            res.add(currList);
        }
        //res.addAll(anagramMap.values());
          
    return res;
    }
}
