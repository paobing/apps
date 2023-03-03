package com.paobing.domain;

import lombok.Data;

@Data // Getter + Setter
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String description;
}
