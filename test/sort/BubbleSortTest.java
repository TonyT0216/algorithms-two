package sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class for BubbleSort
 * @author tonym
 *
 */
public class BubbleSortTest {
	
	private List <Integer> listToSort;

	/**
	 * Arrange the listToSort, so that it has a list of integers to sort.
	 */
	@Before
	public void setUp() {
		listToSort = new ArrayList <Integer>( Arrays.asList(5,2,4,6,1,3,7,8,10,12,14,9,11,13) );
	}
	

	@Test
	public void bubbleSortAGivenList(){
		BubbleSort bubbleSort = new BubbleSort();
		ArrayList <Integer> sortResult = new ArrayList<Integer>();
		
		sortResult = bubbleSort.sort(listToSort);
		assertTrue("1 is the first element of this list", sortResult.get(0).equals(1));
		assertTrue("2 is the second element of this list", sortResult.get(1).equals(2));
		assertFalse("15 is the not the list element of this list", sortResult.get(13).equals(13));

	}

}
