package com.shikanga.betterbanking.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return List.of(
                Transaction.builder()
                        .type("credit")
                        .date(LocalDateTime.now())
                        .accountNumber(accountNumber)
                        .currency("USD")
                        .amount(BigDecimal.valueOf(100.00))
                        .merchantName("acme")
                        .merchantLogo("images/acme-logo.png")
                        .build()
        );
    }
}
