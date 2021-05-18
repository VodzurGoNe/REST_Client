package org.gruzdov.spring.rest.entity;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private Long id;
    private String name;
    private String surname;
    private String department;
    private Integer salary;

    public Employee(String name, String surname, String department, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
}


