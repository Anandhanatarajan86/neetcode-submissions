class Solution {

    Map<String,List<String>> anagramMap = new HashMap<>();
    List<List<String>> anagramGrpList = new LinkedList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for(String word: strs){
                char[] wordCharArray = word.toCharArray();
                Arrays.sort(wordCharArray); // O( N log N)
                String hashKey = new String(wordCharArray);
                anagramMap.putIfAbsent(hashKey,new ArrayList<String>());
                List<String> existingGroup = anagramMap.get(hashKey);
                existingGroup.add(word);// important
                anagramMap.put(hashKey,existingGroup);
        }
    return new ArrayList<>(anagramMap.values());    
    }
}
