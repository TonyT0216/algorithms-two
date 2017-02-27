package sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	private List <Integer> listToSort;
	
	@Before
	public void setUp() {
		listToSort = new ArrayList <Integer>( Arrays.asList(5,2,4,6,1,3,7,8,10,12,14,9,11,13) );
	}

	@Test
	public void insertionSortAGivenList(){
		InsertionSort insertionSort = new InsertionSort();
		ArrayList <Integer> sortResult = new ArrayList<Integer>();

		sortResult = insertionSort.sort(listToSort);
		assertTrue("1 is the first element of this list", sortResult.get(0).equals(1));

	}

}
