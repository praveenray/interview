package com.r3.ps.interview;

/**
 * Represents One Customer of a Retail Bank
 * A Customer has multiple accounts (e.g. Checking, Savings, Money Market)
 * An Account has :
 *      a list of Transactions (debits, credits)
 *      a Balance
*/
public interface BankCustomer {
    /** Customer's Name */
    public String getCustomerName();

    /**
     * Perform one Transaction for an Account.
     * There are two types of Transactions: deposit and withdrawals
     * Deposits are done with a positive amount.
     * Withdrawals are done with negative amount.
     * For Example, if an account (with id XYZ) has a balance of $100 and following calls are made:
     *      performTransaction("XYZ", 50.0)
     *      performTransaction("XYZ", 200.0)
     *      performTransaction("XYZ", -400.0)
     *
     *  Then, the final balance would be:  100 + 50 + 200 - 400 = -50
     *  The successful transaction should be stored in a transactions list.
     *  Return value is the updated Balance for that account (-50 in above example).
     */
    public Double performTransaction(String accountId, Double amount) throws BankException;

    /**
     * Returns current balance for account with [accountId]
     * With above example, a call to getBalance("XYZ") should return -50.0
     * */
    public Double getBalance(String accountId);

    /** Returns data in JSON format */
    public String toJSON();
}
