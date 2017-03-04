package fizzbuzz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Testing Suite for the FizzBuzz class
 * @author tonym
 *
 */
public class FizzBuzzTest {

	// Arrange the FizzBuzz class, and list class to test
	private FizzBuzz fizzBuzzTest;
	private List <String> demo;
	
	
	@Before
	public void setUp()
	{
		fizzBuzzTest = new FizzBuzz();
	}
	
	/*
	 * This test shows that 0 is an invalid argument 
	 * for the FizzBuzz class.  Will throw an 
	 * IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void zeroIsNotAllowed() throws Exception {
		demo = fizzBuzzTest.fizzBuzz(0);
	}
	
	/**
	 * This test shows the number one is an acceptable
	 * argument. Asserts that the int 1 will
	 * return the String "1"  
	 */
	@Test
	public void givenANumberOfOneLeadsToANumber()
	{
		demo = fizzBuzzTest.fizzBuzz(1);
		assertEquals("1", demo.get(0));
	}
	
	/**
	 * This test shows that the number 3 is an acceptable
	 * argument.  Asserts that the int 3 will return the
	 * String list of ["1", "2", "Fizz"]
	 */
	@Test
	public void givenANumberOfThreeCausesAFizz()
	{
		// Act on the data
		demo = fizzBuzzTest.fizzBuzz(3);
		assertEquals("Fizz", demo.get(2));	
	}
	
	/**
	 * This test shows that the number 5 is an acceptable 
	 * argument.  Asserts that the int 5 will return 
	 * a list of Strings: ["1", "2", "Fizz", "4", "Buzz"]
	 */
	@Test
	public void givenANumberOfFiveCausesAFizzAndABuzz()
	{
		demo = fizzBuzzTest.fizzBuzz(5);
		assertEquals("Fizz", demo.get(2));
		assertEquals("Buzz", demo.get(4));
	}
	
	/**
	 * This test shows that the number 15 is an acceptable 
	 * argument.  Asserts that the int 15 will return 
	 * a list of Strings: ["1", "2", "Fizz", "4", "Buzz",
	 * "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
	 * "13", "14", "FizzBuzz"]
	 */
	@Test
	public void givenANumberOfFifteenCausesAFizzBuzz()
	{
		demo = fizzBuzzTest.fizzBuzz(15);
		assertEquals("Fizz", demo.get(2));
		assertEquals("Buzz", demo.get(4));
		assertEquals("FizzBuzz", demo.get(14));
	}
}
