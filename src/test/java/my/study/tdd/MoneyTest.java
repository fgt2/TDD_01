package my.study.tdd;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertThat(product.amount).isEqualTo(10);
		product = five.times(3);
		assertThat(product.amount).isEqualTo(15);
	}

}
