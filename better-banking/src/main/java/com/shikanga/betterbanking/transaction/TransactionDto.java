package com.shikanga.betterbanking.transaction;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
public class TransactionDto {
    Long id;
    String type;
    LocalDateTime date;
    Integer accountNumber;
    String currency;
    BigDecimal amount;
    String merchantName;
    String merchantLogo;

    public static TransactionDto apply(final Transaction transaction){
        return TransactionDto.builder()
                .id(transaction.getId())
                .type(transaction.getType())
                .accountNumber(transaction.getAccountNumber())
                .currency(transaction.getCurrency())
                .amount(transaction.getAmount())
                .merchantName(transaction.getMerchantName())
                .merchantLogo(transaction.getMerchantLogo())
                .build();
    }
}
