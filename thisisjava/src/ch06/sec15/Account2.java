package ch06.sec15;

public class Account2 {
  public static final int MIN_BALANCE = 0;
  public static final int MAX_BALANCE = 1000000;
  private String accNum; // 계좌번호
  private String owner;  // 계좌주
  private int balance;   // 잔액
  

  /**
   * @param accNum
   * @param owner
   * @param balance
   */
  public Account(String accNum, String owner, int balance) {
    this.accNum = accNum;
    this.owner = owner;
    this.balance = balance;
  }

  /**
   * @return the accNum
   */
  public String getAccNum() {
    return accNum;
  }

  /**
   * @param accNum the accNum to set
   */
  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  /**
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * @param owner the owner to set
   */
  public void setOwner(String owner) {
    this.owner = owner;
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
  
  // 예금 기능
  public void deposit(int amount) {
    if(amount <= 0) {
      return;
    }else {
      if( this.balance + amount >  Account.MAX_BALANCE) {
        return;
      }else {
        this.balance += amount;
      }
    }
  }
  
  // 출금 기능
  public int withdraw(int amount) {
    if(balance >= amount) {
      balance -= amount;
      return amount;
    }else {
      return 0;
    }
  }
  
  public String showInfo() {
    String info = accNum + "\t" + owner + "\t" + balance ; 
    return info;
  }
  
}