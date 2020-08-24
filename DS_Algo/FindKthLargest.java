import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Main
{
	// Function to find the K'th largest element in the
	// array using min-heap
	public static int FindKthLargest(List<Integer> ints, int k)
	{
		// create a min-heap using PriorityQueue class
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// Iterate through the elements of array list
		for (int i = k; i < ints.size(); i++)
		{
			pq.add(ints.get(i));
			
			// if pq size is greater than k, poll it
			if (pq.size() > k)
			{
				pq.poll();
			}
		}

		// return the root of min-heap
		return pq.peek();
	}

	public static void main(String[] args)
	{
		List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 2;

		System.out.println("K'th largest element in the array is " +
				FindKthLargest(ints, k));
	}
}