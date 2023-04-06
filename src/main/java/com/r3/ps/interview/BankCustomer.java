package com.r3.ps.interview;

/**
 4  * Represents One Customer of a Retail Bank
 5  * A Customer has multiple accounts (e.g. Checking, Savings, Money Market)
 6  * An Account has :
 7  *      a list of Transactions (debits, credits)
 8  *      a Balance
*/
public interface BankCustomer {
    /** Customer's Name */
    public String getCustomerName();
    /** Returns current balance for account with [accountId] */
    public Double getBalance(String accountId);

    /** Charge account with [accountId] for [amount] and returns the updated balance for the account.
     *  The successful transaction should be stored in transactions list.
     *  There is no overdraft for the account
     */
    public Double spend(String accountId, Double amount) throws BankException;

    /** Returns data in JSON format */
    public String toJSON();
}
