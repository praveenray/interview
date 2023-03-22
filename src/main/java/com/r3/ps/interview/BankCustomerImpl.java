package com.r3.ps.interview;

import org.springframework.stereotype.Component;

@Component
public class BankCustomerImpl implements BankCustomer {
    @Override
    public String getHolderName() {
        return "Implement me";
    }

    @Override
    public Double getBalance(String accountId) {
        return null;
    }

    @Override
    public Double spend(String accountId, Double amount) throws BankException {
        return null;
    }

    @Override
    public String toJSON() {
        return "implement me";
    }
}
