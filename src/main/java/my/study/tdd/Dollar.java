package my.study.tdd;

public class Dollar {

	int amount = 5 * 2;

	public Dollar(int amount) {
		this.amount = amount;
	}

	void times(int multiplier) {
		amount *= multiplier;
		
	}

}
