package com.tenco.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {
    Integer id;
    String admin_id;
    String password;
    String name;
}
