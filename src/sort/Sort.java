package sort;

import java.util.List;

/**
 * An interface that allows classes that implement the behavior of a sorter.
 * @author Tony Toscano
 *
 */
public interface Sort {
	
	// Sorting behavior
	public List<Integer> sort(List<Integer> toSort);

}
