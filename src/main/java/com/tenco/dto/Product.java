package com.tenco.dto;

import lombok.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer id;
    private String barcode;
    private String name;
    private String category;
    private Double price;
    private Double cost;
    private Integer stock;
    private Integer min_stock;
    private LocalDate expire_data;
    private Boolean is_active;
}
