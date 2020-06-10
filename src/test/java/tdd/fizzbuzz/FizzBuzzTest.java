package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void forValue0_shouldReturn0() {

		String result = fizzBuzz.play(0);

		assertThat(result).isEqualTo("0");
	}

	@Test
	void forValue1_shouldReturn1() {

		String result = fizzBuzz.play(1);

		assertThat(result).isEqualTo("1");
	}

	@Test
	void forValue3_shouldReturnFizz() {

		String result = fizzBuzz.play(3);

		assertThat(result).isEqualTo("Fizz");
	}

	@Test
	void forNumbersDivisibleBy3_shouldReturnFizz() {

		String result1 = fizzBuzz.play(3);
		String result2 = fizzBuzz.play(6);
		String result3 = fizzBuzz.play(99);

		assertThat(result1).isEqualTo("Fizz");
		assertThat(result2).isEqualTo("Fizz");
		assertThat(result3).isEqualTo("Fizz");
	}

	@Test
	void forValue5_shouldReturnBuzz() {

		String result = fizzBuzz.play(5);

		assertThat(result).isEqualTo("Buzz");
	}

	@Test
	void forNumbersDivisibleBy5_shouldReturnBuzz() {

		String result1 = fizzBuzz.play(10);
		String result2 = fizzBuzz.play(55);
		String result3 = fizzBuzz.play(950);

		assertThat(result1).isEqualTo("Buzz");
		assertThat(result2).isEqualTo("Buzz");
		assertThat(result3).isEqualTo("Buzz");
	}

	@Test
	void forNumbersNotDivisibleBy3And5_shouldReturnValue() {

		String result1 = fizzBuzz.play(4);
		String result2 = fizzBuzz.play(11);
		String result3 = fizzBuzz.play(701);

		assertThat(result1).isEqualTo("4");
		assertThat(result2).isEqualTo("11");
		assertThat(result3).isEqualTo("701");
	}

	@Test
	void forValue15_shouldReturnFizzBuzz() {

		String result = fizzBuzz.play(15);

		assertThat(result).isEqualTo("FizzBuzz");
	}

	@Test
	void forNumbersDivisibleBy3And5_shouldReturnFizzBuzz() {

		String result1 = fizzBuzz.play(45);
		String result2 = fizzBuzz.play(150);
		String result3 = fizzBuzz.play(105);

		assertThat(result1).isEqualTo("FizzBuzz");
		assertThat(result2).isEqualTo("FizzBuzz");
		assertThat(result3).isEqualTo("FizzBuzz");
	}

}
