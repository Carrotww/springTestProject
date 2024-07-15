package com.spring.project.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {
    private Long id;
    private Stock stock;
    private int quantity;
    private double price;
    private String type;
    private long timestamp;
}
