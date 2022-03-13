package com.shikanga.betterbanking.transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findAllByAccountNumber(Integer accountNumber);
}
