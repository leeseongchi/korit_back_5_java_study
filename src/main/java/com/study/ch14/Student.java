package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotation
@NoArgsConstructor
@AllArgsConstructor
@Data // Setter, Getter, EqualsAndHashCode, ToString 을 합친 것.
public class Student {

    private String name;
    private String phone;
    private String address;
    private int age;
}
