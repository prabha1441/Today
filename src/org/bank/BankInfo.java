package org.bank;

public abstract class BankInfo {
	public void saving() {
		System.out.println("Saving account");
	}
	public void fixed() {
		System.out.println("Fixed deposit");

	}
	public abstract void deposit() ;
}