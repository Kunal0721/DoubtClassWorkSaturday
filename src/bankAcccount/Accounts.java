package bankAcccount;

public class Accounts {
	private int id;
	private String name;
	private double balance;
	private String accountNumber;
	private AccountType type;

	public Accounts(int id, String name, double balance, String accountNumber, AccountType type) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.type = type;
	}

	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Accounts [id=" + id + ", name=" + name + ", balance=" + balance + ", accountNumber=" + accountNumber
				+ ", type=" + type + "]";
	}

}
