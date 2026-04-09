package com.tenco.dto;

import lombok.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sales {
    private String id;
    private Integer product_id;
    private Integer quantity;
    private Double unit_price;
    private LocalDate sold_at;
}
