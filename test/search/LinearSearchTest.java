package search;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class for the Linear Search Class
 * @author tonym
 *
 */
public class LinearSearchTest {
	
	private List <Integer> listToSearch;
	private LinearSearch linearSearchTest;
	
	/**
	 * Arrange the listToSearch and linearSearchTest.
	 * This is NOT a list of random numbers, since it is too unpredictable to make assertions
	 * on random data.
	 */
	@Before
	public void setUp() {
		listToSearch = new ArrayList <Integer>( Arrays.asList(5,2,4,6,1,3,7,8,10,12,14,9,11,13) );
		linearSearchTest = new LinearSearch();
	}
	
	
	/**
	 * A Test implementation of LinearSearch that will test the search function.
	 * @assert that three tests will pass with a value of true, and that three tests will pass with 
	 * 		   a value of false
	 * Doesn't violate multiple assertions since it is checking the same method multiple times
	 */
	@Test
	public void linearSearchForGivenArgument(){
		// Make assertions about linearSearchTest
		assertTrue(linearSearchTest.search(listToSearch, 5));
		assertTrue(linearSearchTest.search(listToSearch, 2));
		assertTrue(linearSearchTest.search(listToSearch, 4));
		assertFalse(linearSearchTest.search(listToSearch, 0));
		assertFalse(linearSearchTest.search(listToSearch, -1));
		assertFalse(linearSearchTest.search(listToSearch, 15));
	}
	
	/**
	 * A Test implementation of LinearSearch that tests the search method if the listToSearch
	 * is null
	 * @throws Exception
	 */
	@Test(expected = NullPointerException.class)
	public void inputtingNoListInputIsNotAllowed() throws Exception {
		// Arrange the listToSearch to be null
		listToSearch = null;
		
		// Act on listToSearch with null input, will throw a NullPointerException
		linearSearchTest.search(listToSearch, 0);
		
	}
	
	/**
	 * A Test implementation of LinearSearch that tests the search method if the listToSearch 
	 * is empty
	 * @throws Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void inputtingAnEmptyListIsNotAllowed() throws Exception {
		// Clear listToSearch of data
		listToSearch.clear();
		
		// Call search method with an empty list, will throw an IllegalArgumentException
		linearSearchTest.search(listToSearch, 10);
	}
	
	/**
	 * A Test implementation of LinearSearch that will test the search function, if only one 
	 * element is in the listToSearch
	 * @assert that three tests will pass with a value of false, and that one test will pass with 
	 * 		   a value of true
	 */
	@Test
	public void linearSearchForGivenArgumentWithAListOfOneElement(){
		// Clear listToSearch of data, add one number to the list
		listToSearch.clear();
		listToSearch.add(34);
		
		// Make assertions about linearSearchTest
		assertFalse(linearSearchTest.search(listToSearch, 10));
		assertFalse(linearSearchTest.search(listToSearch, 2));
		assertFalse(linearSearchTest.search(listToSearch, 4));
		assertTrue(linearSearchTest.search(listToSearch, 34));

	}
	
}
