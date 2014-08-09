package mit.lectures.five;

public class CreditCard {
	private String cardNumber;
	private String secret = "SECRET!3*!";
	@SuppressWarnings("unused")
	private double expenses;

	public CreditCard(double expenses) {
		this.expenses = expenses;
	}

	public CreditCard() {
		this(0);
	}

	public void charge(double amount) {
		expenses += amount;
	}

	public String getCardNumber(String pass) {
		if (this.secret.equals(pass))
			return cardNumber;
		else
			return "Jerkface";
	}
}