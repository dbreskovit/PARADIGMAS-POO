package com.dbreskovit;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Professor extends Person {
    public String siape;
    public String category;
    public String degree;
    public Integer workload;

    public Professor(String cpf, String name, String siape, String category, String degree, Integer workload) {
        super(cpf, name);
        this.siape = siape;
        this.category = category;
        this.degree = degree;
        this.workload = workload;
    }

    @Override
    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public void setName(String firstName, String middleName, String lastName) {
        this.name = firstName + " " + middleName + " " + lastName;
    }
}
