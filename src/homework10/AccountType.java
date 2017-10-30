package homework10;

public class AccountType {
	
	String EUR="EUR";
	String BYR="BYR";
	String USD="USD";
	
	private final String accountType;
	
	AccountType(final String accountType){
		this.accountType = accountType;
	}
	public String getAccountType(){ 
		return accountType; }
}
