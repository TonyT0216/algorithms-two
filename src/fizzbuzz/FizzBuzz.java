package fizzbuzz;

import java.util.ArrayList;
import java.util.List;


/**
 * Write a program that outputs the String representation of numbers 1 to n.
 * 
 * But for multiples of three it should output "Fizz" instead of the number, and 
 * for multiples of five, output "Buzz".  For numbers that are multiples of both three
 * and five, output "FizzBuzz".
 * 
 * @author tonym
 *
 */
public class FizzBuzz {

	/**
	 * Create a String representation of the numbers 1 to the given argument, n.
	 * @param n 	a number that is in greater than 0 
	 * @return		a list of Strings that are representations of 1 to n
	 * @throws IllegalArgumentException	if the argument n is less than or equal to 0.
	 */
	public List<String> fizzBuzz(int n) throws IllegalArgumentException {
		// If the argument is 0 or less, don't except the argument
		if(n <= 0)
			throw new IllegalArgumentException("Any number that is 0 or lower is not acceptable input");
		// Start fizz buzz from 1 and initialize a list that will keep track of
		// which numbers have been added
		int number = 1;
		List<String> trackNumbers = new ArrayList<String>();

		// Repeat this loop until the number is greater than the given int argument
		while (number <= n) {
			// If the number is a multiple of 3 AND is not a multiple of 5
			if (number % 3 == 0 && number % 5 != 0) {
				// Add the String "Fizz" to the trackNumbers list
				String fizz = new String("Fizz");
				trackNumbers.add(fizz);
			}
			// If the number is not a multiple of 3 AND is a multiple of 5
			else if (number % 3 != 0 && number % 5 == 0){
				// Add the String "Bizz" to the trackNumbers list
				String buzz = new String("Buzz");
				trackNumbers.add(buzz);
			}
			// If the number is a multiple of 3 and 5
			else if(number % 3 == 0 && number % 5 == 0){
				// Add the String "FizzBuzz" to the trackNumbers list
				String fizzbuzz = new String("FizzBuzz");
				trackNumbers.add(fizzbuzz);
			}
			// Else the number is neither of the options listed above
			else {
				// Add the number into the a list as a String
				trackNumbers.add(String.valueOf(number));
			}
			// Increment number
			number++;
		}
		
		return trackNumbers;
	}
}
