package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	@Parameters({"1", "2", "4", "7", "11", "13", "14"})
	public void returnsNumberForNumberNotDivisibleByThreeAndFive(int number) {
		assertThat(fizzbuzz.calculate(number)).isEqualTo("" + number);
	}

	@Test
	@Parameters({"3", "6", "9", "12", "18", "21", "24"})
	public void returnFizzForNumberDivisibleByThree(int number) {
		assertThat(fizzbuzz.calculate(number)).isEqualTo("Fizz");
	}

	@Test
	@Parameters({"5", "10", "20", "25", "35", "40", "50"})
	public void returnBuzzForNumberDivisibleByFive(int number) {
		assertThat(fizzbuzz.calculate(number)).isEqualTo("Buzz");
	}

	@Test
	@Parameters({"15", "30", "45", "60"})
	public void returnsFizzBuzzForNumberDivisibleByThreeAndFive(int number) {
		assertThat(fizzbuzz.calculate(number)).isEqualTo("FizzBuzz");
	}
}
