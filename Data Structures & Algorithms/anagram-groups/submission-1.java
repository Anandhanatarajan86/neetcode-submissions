class Solution {

    Map<String,List<String>> anagramMap = new HashMap<>();
    List<List<String>> anagramGrpList = new LinkedList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for(String word: strs){
                int[] counter = new int[26];
                char[] wordCharArray = word.toCharArray();
                for(int charIndex = 0; charIndex < wordCharArray.length; charIndex++){
                    counter[wordCharArray[charIndex]-'a']++;
                }
                String hashKey = Arrays.toString(counter);
               // String hashKey = new String(wordCharArray);
                anagramMap.putIfAbsent(hashKey,new ArrayList<String>());
                List<String> existingGroup = anagramMap.get(hashKey);
                existingGroup.add(word);// important
                anagramMap.put(hashKey,existingGroup);
        }
    return new ArrayList<>(anagramMap.values());    
    }
}
