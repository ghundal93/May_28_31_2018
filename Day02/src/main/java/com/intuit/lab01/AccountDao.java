package com.intuit.lab01;

public interface AccountDao {
	void deposit(int accountNumber,int amount);
	void withdraw(int accountNumber,int amount);
}
