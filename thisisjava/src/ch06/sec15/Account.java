package ch06.sec15;

public class Account {
	  public static final int MIN_BALANCE = 0;
	  public static final int MAX_BALANCE = 1000000;
	  private int balance;
	  
	  private String accountNum;
	  private String accountOwner;
	  
//	  /**
//	   * 
//	   * @param accountNum
//	   * @param accountOwner
//	   * @param balance
//	   */
	  

//	    public Account(String accountNum, String accountOwner, int balance) {
//	        this.accountNum = accountNum;
//	        this.accountOwner = accountOwner;
//	        this.balance = balance;
//
//	    }  SOURCE -> GENERATE FILED

	    public Account(int balance, String accountNum, String accountOwner) {
	super();
	this.balance = balance;
	this.accountNum = accountNum;
	this.accountOwner = accountOwner;
}

		public String getAccountNum() {
	        return accountNum;
	    }

	    public String getAccountOwner() {
	        return accountOwner;
	    }


	  public int getBalance() {
	    return balance;
	  }

	  public void setBalance(int balance) {
	    if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
	      return;
	    }
	    this.balance = balance;
	  }
	  
	  //예금기능
	  public void depost(int amount) {
		  if(amount<=0) {
			  return;
		  }else {
			  if(this.balance + amount > Account.MAX_BALANCE ) {
			  return;
			  }else {
				  this.balance += amount;
			  }
		  }
			  
	  }
	}


		//출금기능
	public int withdraw(int amount){
		if(this.balance >= amount) {
			balance -= amount;
			return amount;
		}
	}
	