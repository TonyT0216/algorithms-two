package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This BubbleSort class implements the least efficient means to sort a List.
 * This class inherits its sorting behavior from a Sort interface.
 * 
 *
 * @author tonym
 *
 */
public class BubbleSort implements Sort {

	/**
	 * Given a list of integers, this method sorts the list accordingly in ascending order.
	 * @Override overrides the sort method in Sort interface, so that it may return an ArrayList
	 * @return an ArrayList of Integers that are sorted in ascending order.
	 */
	@Override
	public ArrayList<Integer> sort(List<Integer> toSort) {
		
		// copy the contents of the toSort List into an ArrayList
		ArrayList <Integer> copiedList = copyGivenList(toSort);
		
		// initialize a loop to go through the contents of copiedList from the start
		for(int i = 0; i <= copiedList.size() - 1; i++)
		{
			// then initialize a loop that go through the contents of copiedList backwards
			for(int j = copiedList.size() - 1; j > 0; j--)
			{
				if(copiedList.get(j) < copiedList.get(j - 1))
				{
					Integer one = copiedList.get(j);
					Integer two = copiedList.get(j - 1);
					copiedList.set(j - 1, one);
					copiedList.set(j, two);
//					copiedList.set(j, temp);
//					copiedList.set(j - 1, copiedList.get(j - 1));
				}
			}
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
