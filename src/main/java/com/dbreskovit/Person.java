package com.dbreskovit;

import java.util.Date;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    protected String cpf;
    public String name;
    public Date birthDate;
    public String address;
    public String city;
    public String state;
    public String gender;
    public String maritalStatus;

    public Person(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }
}
