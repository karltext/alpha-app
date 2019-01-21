package com.mastek.alpha.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Account_ENTITY_TABLE")
@XmlRootElement
public class Account {
	
	@FormParam("accountNumber")
	int accountNumber; 
	@FormParam("accountType")
	String accountType;
	@FormParam("bonuspoints")
	double bonuspoints;
	
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
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
