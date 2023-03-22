package com.r3.ps.interview;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BankTest {
    @Test
    public void testBank1() {
        BankCustomer customer = new BankCustomerImpl();
        assertNotNull(customer);
    }
}
