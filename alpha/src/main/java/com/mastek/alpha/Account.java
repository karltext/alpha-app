package com.mastek.alpha;

public class Account {

	int accountNumber; 
	String accountType;
	double bonuspoints;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBonuspoints() {
		return bonuspoints;
	}
	public void setBonuspoints(double bonuspoints) {
		this.bonuspoints = bonuspoints;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", bonuspoints="
				+ bonuspoints + "]";
	}
	
	
	
}
