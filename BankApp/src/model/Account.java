package model;

public class Account {
	
	private double balance;
	private String accNum;
	private String curType;
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accNum=" + accNum + ", curType=" + curType + "]";
	}

	public Account(double balance, String accNum, String curType) {
		this(accNum,curType);
		this.balance = balance;
	}
	
	public Account(String accNum, String curType) {
		super();
		this.accNum = accNum;
		this.curType = curType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getCurType() {
		return curType;
	}
	public void setCurType(String curType) {
		this.curType = curType;
	}
	
	
}
