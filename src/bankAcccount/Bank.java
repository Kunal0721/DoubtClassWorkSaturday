package bankAcccount;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	List<Accounts> accounts = new LinkedList<Accounts>();
	private Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("1. create new Account");
		System.out.println("2. read particular account");
		System.out.println("3. read all");
		System.out.println("4. Transfer");
		System.out.println("5. Debit");
		System.out.println("6. Credit");
		System.out.println("7. Exit..");
		System.out.println("============================");
		return sc.nextInt();
	}

	public void run() {
		while (true) {
			int choice = menu();
			switch (choice) {
			case 1: createNewAccount();
				break;
			case 2:
				System.out.println("read particular");
				break;
			case 3: readAll();
				break;
			case 4:
				System.out.println("Transfer");
				break;
			case 5:
				System.out.println("Debit");
				break;
			case 6:
				System.out.println("credit");
				break;
			case 7:
				System.out.println("Exit");
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	public void createNewAccount() {
		Accounts a = new Accounts();
		
		sc.nextLine();
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		a.setName(name);

		System.out.println("Enter balance  : ");
		double balance = sc.nextDouble();
		a.setBalance(balance);

		System.out.println("Enter type : ");
		System.out.println("1. Saving ");
		System.out.println("2. Current ");
		int i = sc.nextInt();
		if (i == 1) {
			a.setType(AccountType.SAVING);
		} else {
			a.setType(AccountType.CURRENT);
		}

		System.out.println("Enter account number : ");
		String acno = sc.next();
		a.setAccountNumber(acno);

		accounts.add(a);
	}

	public void readAll() {
		for (Accounts a : accounts) {
			System.out.println(a);
		}
		System.out.println();
	}

}
