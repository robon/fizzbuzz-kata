package tdd.fizzbuzz;

public class App {

	public static void main(String[] args) {

		System.out.println("Program wypisuje na konsolę odpowiedzi gry FizzBuzz dla liczb od 1 do 100");

		FizzBuzz fizzBuzz = new FizzBuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
			for (int j = 1; j <= i; j++) {
				System.out.print(fizzBuzz.play(j));
				if (j < i) System.out.print(",");
			}
			System.out.println();
		}
	}
}
