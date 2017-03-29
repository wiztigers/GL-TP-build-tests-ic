package fr.unistra.fizzbuzz;

public class FizzBuzz {

	public String calculate(int number) {
		if (isDivisibleBy(number, 3) && isDivisibleBy(number, 5)) return "FizzBuzz";
		if (isDivisibleBy(number, 3)) return "Fizz";
		if (isDivisibleBy(number, 5)) return "Buzz";
		return String.valueOf(number);
	}

	private boolean isDivisibleBy(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

	public static void main(final String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		for(int c=1; c<=100; c++)
			System.out.println(c+": "+fizzbuzz.calculate(c));
	}
}
