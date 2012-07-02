package my.study.tdd;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertThat(five.times(2)).isEqualTo(new Dollar(10));
		assertThat(five.times(3)).isEqualTo(new Dollar(15));
	}
	
	@Test
	public void testEquality() {
		assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
	}

}
