package com.shikanga.betterbanking.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testTransactionCount() {
        when(transactionRepository.findAllByAccountNumber(anyInt()))
                .thenReturn(transactions());

        var transactionService = new TransactionServiceImpl(transactionRepository);
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }

    private List<Transaction> transactions() {
        return List.of(
                Transaction.builder()
                        .type("credit")
                        .date(LocalDateTime.now())
                        .accountNumber(1234567)
                        .currency("USD")
                        .amount(BigDecimal.valueOf(100.00))
                        .merchantName("acme")
                        .merchantLogo("images/acme-logo.png")
                        .build()
        );
    }
}
