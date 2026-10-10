class Solution {

    Map<Integer,Integer> frequencyMap = new HashMap<>();
    PriorityQueue<Integer> minHeap;
    int[] result;
    public int[] topKFrequent(int[] nums, int k) {
            result = new int[k];
            minHeap = new PriorityQueue<>((a,b)->(frequencyMap.get(a)-frequencyMap.get(b)));
            //Add all elements to frequencyMap first TC :O(N)
            for(int num : nums){
                    frequencyMap.putIfAbsent(num,0);
                    frequencyMap.put(num,frequencyMap.get(num)+1);
            }
        
        for(Map.Entry<Integer,Integer>  entry: frequencyMap.entrySet()){
                minHeap.offer(entry.getKey());
                //always maintain heap size as K
                if(minHeap.size()>k){
                    minHeap.poll();
                }           
        }
        int resIndex = 0;
        while(!minHeap.isEmpty()){
                result[resIndex++] = minHeap.poll();

        }

    return result;
    }
}
