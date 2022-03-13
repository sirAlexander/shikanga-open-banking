package com.shikanga.betterbanking.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }
}
