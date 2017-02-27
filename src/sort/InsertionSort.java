package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An implementation of insertion sort, based off of Introduction to Algorithms by Cormen, Leiserson, Rivest, and Stein.
 * This implementation assumes that a List of numbers are being given, primarly Integers, Longs, Doubles, and Shorts.
 * 
 * There may be an implementation that does this for other data types (most likely BigInteger)
 * 
 * @author Tony Toscano
 *
 */
public class InsertionSort implements Sort {

	/**
	 * This method will sort a given List, via a parameter, toSort, using insertion sort.
	 * 
	 * @param An unsorted List of numbers, toSort
	 * @return an ArrayList sorted in ascending numerical order
	 */
	@Override
	public ArrayList<Integer> sort(List <Integer> toSort) {
		
		// copy the contents of the toSort List into an ArrayList
		ArrayList <Integer> copiedList = copyGivenList(toSort);
		
		// initialize a loop to go through the contents of copiedList
		for(int j = 1; j < copiedList.size(); j++)
		{
			// retrieve the element that will be sorted in the list  
			Integer key = copiedList.get(j);
			
			// this loop pointer will allow the while loop to go backwards from the jth position
			int i = j - 1;
			
			// go through the copiedList, as long as the pointer isn't negative, and as long as 
			// the copiedList.get(i) entry is greater than the key
			while(i >= 0 && copiedList.get(i) > key)
			{
				// shift the value from the ith position to the ith + 1 position
				copiedList.set(i + 1, copiedList.get(i));
				
				// decrement the loop pointer, to go back through the array
				i = i - 1;
			}
			
			// shift the value from the jth position to the ith + 1 position
			copiedList.set(i + 1, key);		
		}
		
		return copiedList;
	}
	
	/**
	 * This method will sort a given List, via a parameter, toSort, using insertion sort.
	 * 
	 * @param toSort An unsorted List of numbers, toSort
	 * @return an ArrayList sorted in descending numerical order.
	 */
	public ArrayList<Integer> sortDescending(List <Integer> toSort){
		
		// copy the contents of the toSort List into an ArrayList
		ArrayList <Integer> copiedList = copyGivenList(toSort);
		
		// initialize a loop to go through the contents of copiedList
		for(int j = 1; j < copiedList.size(); j++)
		{
			// retrieve the element that will be sorted in the list  
			Integer key = copiedList.get(j);
			
			// this pointer will allow the next loop backwards
			int i = j - 1;
			
			// go through the copiedList, as long as the pointer isn't negative, and as long as
			// the copiedList.get(i) entry is less than the key
			while(i >= 0 && copiedList.get(i) < key)
			{
				// shift the value from the ith position to the ith + 1 position
				copiedList.set(i + 1, copiedList.get(i));
				
				// decrement the loop pointer, to go back through the array
				i = i - 1;
			}
			
			// shift the value from the jth position to the ith + 1 position
			copiedList.set(i + 1, key);		
		}
		return copiedList;
		
	}
	/**
	 * A helper method to copy the list to be sorted, into another list.  
	 * @param toSort  the List to be sorted by sort()
	 * @return a list that will be straight copy of the param, toSort
	 */
	private ArrayList<Integer> copyGivenList(List<Integer> toSort)
	{
		// copy the contents of the toCopy List into an Array
		Integer[] copyToSort = toSort.toArray(new Integer[0]);
		
		// Initialize an ArrayList of Integers
		ArrayList <Integer> copiedList = new ArrayList<Integer>();
		
		// loop through copyToSort array and put it into an ArrayList
		for(Integer entry : copyToSort)
		{
			// add entries, respectively
			copiedList.add(entry);
		}
		
		// in the instance of null entries in the copiedList, remove all of them
		copiedList.removeAll(Collections.singleton(null));
		
		// return the result
		return copiedList;
	}
}