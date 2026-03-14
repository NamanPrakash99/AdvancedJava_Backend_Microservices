package com.processing_service.DTO;

import java.io.Serializable;

public class RechargeProducerDTO implements Serializable {
	private String mobileNumber ;
	private double amount ; 
	String operator ;
	public RechargeProducerDTO() {} 
	public RechargeProducerDTO(String mobileNumber, double amount, String operator) {
		super();
		this.mobileNumber = mobileNumber;
		this.amount = amount;
		this.operator = operator;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	@Override
	public String toString() {
		return "RechargeProducerDTO [mobileNumber=" + mobileNumber + ", amount=" + amount + ", operator=" + operator
				+ "]";
	}
	
}
