package theMoneyExample;

public abstract class Money {
	
	protected int amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	
	public abstract Money times(int multiplier);
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

}
