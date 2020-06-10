package tdd.fizzbuzz;

public class FizzBuzz {

	String result;

	String play(int i) {
		result = "";
		if (i <= 0) throw new IllegalArgumentException("Wymagana liczba naturalna większa od 0");
		if (i % 3 == 0 || String.valueOf(i).contains("3")) result = "Fizz";
		if (i % 5 == 0 || String.valueOf(i).contains("5")) result += "Buzz";
		if (i % 7 == 0 || String.valueOf(i).contains("7")) result += "Bar";
		if (result.equals("")) {
			return String.valueOf(i);
		} else {
			return result;
		}
	}
}
