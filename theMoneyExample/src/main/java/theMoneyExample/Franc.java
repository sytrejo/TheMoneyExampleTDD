package theMoneyExample;

public class Franc extends Money{
	
	private String currency;

	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	};

	@Override
	public String currency() {
		return currency;
	}
	
}
