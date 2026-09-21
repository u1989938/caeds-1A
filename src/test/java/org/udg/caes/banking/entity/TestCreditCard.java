package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;
import org.udg.caes.banking.exceptions.ClientNotFound;
import org.udg.caes.banking.service.ClientService;
import org.udg.caes.banking.service.CreditCardService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreditCard {
    @Test
    void testCredit() throws ClientNotFound {

        CreditCard cc = new CreditCard("test");
        cc.credit(100);
        assertEquals(100, cc.getCredit());
    }
}
