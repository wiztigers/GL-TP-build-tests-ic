package fr.unistra.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJUnitTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void returnsNumberForInputNotDivisibleByThreeOrFive() {
		assertEquals("1", fizzbuzz.calculate(1));
		assertEquals("2", fizzbuzz.calculate(2));
		assertEquals("4", fizzbuzz.calculate(4));
		assertEquals("7", fizzbuzz.calculate(7));
		assertEquals("11",fizzbuzz.calculate(11));
		assertEquals("13",fizzbuzz.calculate(13));
		assertEquals("14",fizzbuzz.calculate(14));
	}

	@Test
	public void returnFizzForInputDivisibleByThree() {
		assertEquals("Fizz", fizzbuzz.calculate(3));
		assertEquals("Fizz", fizzbuzz.calculate(6));
		assertEquals("Fizz", fizzbuzz.calculate(9));
		assertEquals("Fizz", fizzbuzz.calculate(12));
		assertEquals("Fizz", fizzbuzz.calculate(18));
		assertEquals("Fizz", fizzbuzz.calculate(21));
		assertEquals("Fizz", fizzbuzz.calculate(24));
	}

	@Test
	public void returnBuzzForInputDivisibleByFive() {
		assertEquals("Buzz", fizzbuzz.calculate(5));
		assertEquals("Buzz", fizzbuzz.calculate(10));
		assertEquals("Buzz", fizzbuzz.calculate(20));
		assertEquals("Buzz", fizzbuzz.calculate(25));
		assertEquals("Buzz", fizzbuzz.calculate(35));
		assertEquals("Buzz", fizzbuzz.calculate(40));
		assertEquals("Buzz", fizzbuzz.calculate(50));
	}

	@Test
	public void returnsFizzBuzzForInputDivisibleByThreeAndFive() {
		assertEquals("FizzBuzz", fizzbuzz.calculate(15));
		assertEquals("FizzBuzz", fizzbuzz.calculate(30));
		assertEquals("FizzBuzz", fizzbuzz.calculate(45));
		assertEquals("FizzBuzz", fizzbuzz.calculate(60));
	}
}
