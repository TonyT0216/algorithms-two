package sums;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class for the TwoSum Algorithm
 * @author tonym
 *
 */
public class TwoSumsTest {
	
	private TwoSums testTwoSums;
	private int[] testNumbers;
	private int testTarget;
	

	
	@Before
	public void setUp()
	{
		testTwoSums = new TwoSums();
		testNumbers = new int[] {2,7,1,15};
	}
	
	/**
	 * A Test of twoSums that returns a valid input from an array of ints
	 * 
	 * @throws Exception
	 */
	@Test
	public void anArrayOfSumsAndATargetWillReturnAnOutput() throws Exception 
	{
		// Arrange the test
		testTarget = 9;
		int[] expectedResult = {0,1};
		
		// Test the twoSums algorithm
		int[] testResult = testTwoSums.twoSum(testNumbers, testTarget);
		
		// Assert that expectedResult is the same as testResult
		assertArrayEquals(expectedResult, testResult);
	}
	
	@Test(expected = NullPointerException.class)
	public void passingInANullArrayWillNotWork() throws Exception 
	{
		// Arrange the test
		testNumbers = null;
		testTarget = 9;
		int[] expectedResult = {0,1};
		
		// Acting on this will result in a NullPointerException
		int[] testResult = testTwoSums.twoSum(testNumbers, testTarget);
		assertArrayEquals(expectedResult, testResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void passingInAnArrayOfZeroWillNotWork() throws Exception 
	{
		// Arrange the test
		testNumbers = new int[0];
		testTarget = 9;
		int[] expectedResult = {0,1};
		
		// Acting on this will result in an IllegalArgumentException
		int[] testResult = testTwoSums.twoSum(testNumbers, testTarget);
		assertArrayEquals(expectedResult, testResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void passingInAnArrayOfLengthOneWillNotWork() throws Exception 
	{
		// Arrange the test
		testNumbers = new int[] {2};
		testTarget = 9;
		int[] expectedResult = {0,1};
		
		// Acting on this will result in an IllegalArgumentException
		int[] testResult = testTwoSums.twoSum(testNumbers, testTarget);
		assertArrayEquals(expectedResult, testResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void sometimesNoSumCanBeFound() throws IllegalArgumentException 
	{	
		// Arrange the test
		testNumbers = new int[] {2,3};
		testTarget = 9;
		int[] expectedResult = {0,1};
		
		// Acting on this will result in an IllegalArgumentException
		int[] testResult = testTwoSums.twoSum(testNumbers, testTarget);
		assertArrayEquals(expectedResult, testResult);
	}
	
	
	
	

}
