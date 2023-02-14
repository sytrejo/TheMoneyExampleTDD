package theMoneyExample;

public class Franc extends Money{
	

	public Franc(int amount) {
		this.amount = amount;
	}
	
	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	@Override
	protected String currency() {
		return "CHF";
	}
	
}
