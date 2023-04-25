package com.r3.ps.interview;

/**
 * Represents One Customer of a Retail Bank
 * A Customer has multiple accounts (e.g. Checking, Savings, Money Market)
 * An Account has :
 *      a list of Transactions (debits, credits)
 *      a non-negative Balance
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
     *      performTransaction("XYZ", 150.0)
     *
     *  Then, the final balance would be:  100 + 50 + 200 - 150 = 200
     *  The successful transaction should be stored in a transactions list.
     *  Return value is the updated Balance for that account (200 in above example).
     *
     *  The Balance is NOT Allowed to go into negative. It can be zero but not negative. Handle this error case appropriately.
     */
    public Double performTransaction(String accountId, Double amount);

    /**
     * Returns current balance for account with [accountId]
     * With above example, a call to getBalance("XYZ") should return 200.0
     * */
    public Double getBalance(String accountId);

    /** Returns data in JSON format */
    public String toJSON();
}
