package com.shikanga.betterbanking.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TransactionServiceTest {

    TransactionService transactionService = new TransactionServiceImpl();

    @Test
    void testFindAllByAccountNumber() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }
}
