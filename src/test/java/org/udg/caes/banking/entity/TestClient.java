package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;
import org.udg.caes.banking.exceptions.ClientNotFound;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {
    @Test
    void testClient() throws ClientNotFound {
        String id = "test";
        Client cc = new Client(id);
        assertEquals(id, cc.getId());

    }

}
