package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;
import org.udg.caes.banking.exceptions.ClientNotFound;
import org.udg.caes.banking.exceptions.NotEnoughBalance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {
    @Test
    void testAccount() throws NotEnoughBalance {
        String id = "test";
        long balance = 100;

        Account acc = new Account(id, balance);
        assertEquals(id, acc.getId());

        assertEquals(balance, acc.getBalance());

        acc.credit(50);
        assertEquals(balance+50, acc.getBalance());

        acc.debit(50);
        assertEquals(balance, acc.getBalance());

        try {
            acc.debit(101);
        } catch (NotEnoughBalance ignored) {
        }

    }

}
