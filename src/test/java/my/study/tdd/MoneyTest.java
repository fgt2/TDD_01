package my.study.tdd;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertThat(five.amount).isEqualTo(10);
	}

}
