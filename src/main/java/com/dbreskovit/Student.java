package com.dbreskovit;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {
    public String enrollment;
    public String courseCode;
    public String admissionYear;
    public String phone;
    public String email;

    Student(String cpf, String name, String enrollment, String courseCode) {
        super(cpf, name);
        this.enrollment = enrollment;
        this.courseCode = courseCode;
    }

    @Override
    public void setName(String name) {
        this.name = "[ " + name + " ]";
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public void setName(String firstName, String middleName, String lastName) {
        this.name = firstName + " " + middleName + " " + lastName;
    }

    public void setAddress(String street, String number, String neighborhood, String complement) {
        this.address = street + ", " + number + " " + neighborhood + " " + complement;
    }
}
