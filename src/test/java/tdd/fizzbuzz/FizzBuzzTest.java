package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void forValue0_shouldReturn0() {

		assertThatThrownBy(() -> fizzBuzz.play(0)).isInstanceOf(IllegalArgumentException.class);
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
		String result3 = fizzBuzz.play(601);

		assertThat(result1).isEqualTo("4");
		assertThat(result2).isEqualTo("11");
		assertThat(result3).isEqualTo("601");
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
		String result3 = fizzBuzz.play(90);

		assertThat(result1).isEqualTo("FizzBuzz");
		assertThat(result2).isEqualTo("FizzBuzz");
		assertThat(result3).isEqualTo("FizzBuzz");
	}

	@Test
	void forValue31_shouldReturnFizz() {

		String result = fizzBuzz.play(31);

		assertThat(result).isEqualTo("Fizz");
	}

	@Test
	void forValue452_shouldReturnBuzz() {

		String result = fizzBuzz.play(452);

		assertThat(result).isEqualTo("Buzz");
	}

	@Test
	void forValue333_shouldReturnFizz() {

		String result = fizzBuzz.play(333);

		assertThat(result).isEqualTo("Fizz");
	}

	@Test
	void forValue5555_shouldReturnFizz() {

		String result = fizzBuzz.play(5555);

		assertThat(result).isEqualTo("Buzz");
	}

	@Test
	void forValue7_shouldReturnBar() {

		String result = fizzBuzz.play(7);

		assertThat(result).isEqualTo("Bar");
	}

	@Test
	void forNumbersDivisibleBy3And5And7_orContain3And5And7_shouldReturnFizzBuzzBar() {

		String result1 = fizzBuzz.play(357);
		String result2 = fizzBuzz.play(735);
		String result3 = fizzBuzz.play(105);

		assertThat(result1).isEqualTo("FizzBuzzBar");
		assertThat(result2).isEqualTo("FizzBuzzBar");
		assertThat(result3).isEqualTo("FizzBuzzBar");
	}
}
