package bankApp;

public class BankUser {
	
	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.setName("Ali");
		String mo = user1.getName();
		System.out.println(mo);
		
		
		/*
		user1.name = "Ali";
		user1.dep(user1.name, 1900);
		
		BankType user2 = new BankType();
		user2.update();
		String mo = user2.toString();
		System.out.println(mo);
		
		*/
	}

}
