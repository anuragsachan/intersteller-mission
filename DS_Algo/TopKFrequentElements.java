/**
 * @type of arr : integer array
 * @type of k : integer
 * @return type: integer array
 */
class Solution {
    public ArrayList<Integer> topKFrequentElements(ArrayList<Integer> arr, int k) {
    	// write your awesome code here  
        //count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // create a min heap
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
		
        //maintain a heap of size k.
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	pq.offer(entry);
            if(pq.size() > k) {
            	pq.poll();
            }
        }
        
         //get all elements from the heap
    	ArrayList<Integer> results = new ArrayList<>();
    	while (pq.size() > 0) {
        	results.add(pq.poll().getKey());
    	}
        
        //reverse the order
    	Collections.reverse(results);
        
        return results;
    }
}