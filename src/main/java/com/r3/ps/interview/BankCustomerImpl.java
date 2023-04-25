package com.r3.ps.interview;

import org.springframework.stereotype.Component;

@Component
public class BankCustomerImpl implements BankCustomer {
    @Override
    public String getCustomerName() {
        return "Implement me";
    }

    @Override
    public Double getBalance(String accountId) {
        return null;
    }

    @Override
    public Double performTransaction(String accountId, Double amount) {
        return null;
    }

    @Override
    public String toJSON() {
        return "implement me";
    }

    @Override
    public String toString() {
        return toJSON();
    }
}
