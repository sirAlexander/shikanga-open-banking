package com.shikanga.betterbanking.transaction;

import com.shikanga.betterbanking.BetterBankingApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {BetterBankingApplication.class})
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    void testTransactionCount() {
        assertEquals(2, transactionService.findAllByAccountNumber(1234567).size());
    }

}
