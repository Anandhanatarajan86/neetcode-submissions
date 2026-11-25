class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String currentWord: strs){
            char[] currentCharArray = currentWord.toCharArray();
            Arrays.sort(currentCharArray);
            //check if we have matching anagram in HashMap
            String anagramKey = new String(currentCharArray);
            anagramMap.putIfAbsent(anagramKey, new ArrayList<>());
            anagramMap.get(anagramKey).add(currentWord); 
            }
        
        // for(List<String> currList:anagramMap.values() ){
        //     res.add(currList);
        // }
        return anagramMap.values().stream().collect(Collectors.toList());
        //res.addAll(anagramMap.values());
       
    }
}
