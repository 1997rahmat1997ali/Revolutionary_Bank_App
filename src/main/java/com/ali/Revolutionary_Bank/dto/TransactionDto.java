package com.ali.Revolutionary_Bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.Bidi;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private String transctionType;
    private BigDecimal amount;
    private String accountNumber;
    private String status;
}
