package com.spring.project.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Stock {
    private int id;
    private String name;
    private String symbol;
    private double currentPrice;
}
