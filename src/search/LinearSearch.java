package search;

import java.util.List;

/**
 * An implementation of Linear Search, which will search the contents of a list
 * for a number. If the entry is not found, a message will be printed stating
 * the entry wasn't in the list.
 * 
 * @author Tony Toscano
 *
 */
public class LinearSearch implements Search {

	/**
	 * The method will search a given List, listToSearch, sequentially. It will
	 * search for the numberToFind, and return true, if it is present. If it is
	 * not found, it will return false.
	 * 
	 * @throws NullPointerException
	 *             if listToSearch is null
	 * @throws IllegalArgumentException
	 *             if listToSearch is empty
	 */
	@Override
	public boolean search(List<Integer> listToSearch, int numberToFind) throws NullPointerException {
		// Check to see if listToSearch is null or is empty
		// Will throw an appropriate exception
		if (listToSearch == null)
			throw new NullPointerException("listToSearch is null");
		else if (listToSearch.isEmpty())
			throw new IllegalArgumentException("listToSearch has no entries in it");

		// If the list has only one element
		// Return if the first element of listToSearch is the same as the
		// numberToFind
		if (listToSearch.size() == 1) {
			return listToSearch.get(0).equals(numberToFind);
		}

		// Loop through the listToSearch sequentially
		for (int entry : listToSearch) {
			// If the entry is equal to the numberToFind
			if (entry == numberToFind) {

				return true;

			}
		}

		return false;

	}
}
