package sums;

import java.util.Hashtable;

/**
 * This class implements a TwoSum algorithm, as seen on LeetCode.
 * @author tonym
 *
 */
public class TwoSums {
	
	/**
	 * Given an array of integers (or ints), return indices of the two numbers s.t. they 
	 * add up to a specific target.
	 * 
	 * @param nums						an array of ints
	 * @param target					the sum of the two desired numbers
	 * @return 							output, which is an array of ints
	 * @throws NullPointerException		when int[] nums is null, so no null in 
	 * @throws IllegalArgumentException when the length of nums is 0 or 1, or if no solution is found
	 */
	public int[] twoSum( int[] nums, int target ) throws NullPointerException, IllegalArgumentException{
		if(nums == null)
			throw new NullPointerException("Cannot take the two sums of a null value");
		else if(nums.length == 0)
			throw new IllegalArgumentException("Cannot take the two sums of an empty array");
		else if(nums.length == 1)
			throw new IllegalArgumentException("Cannot calculate two sums from an array of one number.");
		
		// Initialize the solution output
		Hashtable <Integer, Integer> table = new Hashtable <Integer, Integer> ();
		
		
		for (int i = 0; i < nums.length; i++)
		{
			int complement = target - nums[i];
			if(table.containsKey(complement)) {
				return new int[] { table.get(complement), i};
			}
			table.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
