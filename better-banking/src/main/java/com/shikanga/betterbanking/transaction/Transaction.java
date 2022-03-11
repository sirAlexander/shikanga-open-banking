package com.shikanga.betterbanking.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Transaction {
    String type;
    LocalDateTime date;
    Number accountNumber;
    String currency;
    BigDecimal amount;
    String merchantName;
    String merchantLogo;
}
