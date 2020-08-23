import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Main
{
	// Function to find the K'th smallest element in the
	// array using max-heap
	public static int findKthSmallest(List<Integer> A, int k)
	{
		// create a max-heap using PriorityQueue class and
		// insert first k elements of the array into the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    
        //Iterate through the array list
		for (int i = 0; i < A.size(); i++)
		{   
            //Add to PQ
			pq.add(A.get(i));
			
			// if PriorityQueue's size is greater than k
			if (pq.size() > k) {
				pq.poll();
			}
		}

		// return the root of max-heap
		return pq.peek();
	}

	public static void main(String[] args)
	{
		List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 3;

		System.out.println("K'th smallest element in the array is " +
									findKthSmallest(A, k));
	}
}