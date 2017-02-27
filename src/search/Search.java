package search;

import java.util.List;

/**
 * An interface that allows classes to use searching behavior.
 * @author Tony Toscano
 *
 */
public interface Search {

	// Searching behavior
	public boolean search(List<Integer> listToSearch, int numberToFind);
}
