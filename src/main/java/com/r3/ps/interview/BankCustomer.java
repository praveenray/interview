package com.r3.ps.interview;

public interface BankCustomer {
    /** Returns wallet's holder name */
    public String getHolderName();
    /** Returns a current balance for account with [accountId] */
    public Double getBalance(String accountId);
    /** Charge account with [accountId] for [amount] and returns the updated balance for the account.
     *  The successful transaction should be stored in transactions list.
     *  There is no overdraft for the account
     */
    public Double spend(String accountId, Double amount) throws BankException;
    /** Returns wallet's data in JSON format */
    public String toJSON();
}
