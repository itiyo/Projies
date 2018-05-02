package bankApp;

public class BankType extends Bank{
	String type = "this is an override!!";
	
	
	
	void update(){
		
		System.out.println("Account has been updated!");
		
	}
	
	@Override
	public String toString() {
		return type;
	}

}
