package tdd.fizzbuzz;

public class FizzBuzz {

	String play(int i) {
		if (i == 0) return "0";
		if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
		if (i % 3 == 0) return "Fizz";
		if (i % 5 == 0) return "Buzz";
		return String.valueOf(i);
	}
}
