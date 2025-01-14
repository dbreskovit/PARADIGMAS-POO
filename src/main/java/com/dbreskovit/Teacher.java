package com.dbreskovit;

public class Teacher extends Person {
    public String siape;
    public String category;
    public String degree;
    public Integer workload;

    public Teacher(String cpf, String name, String siape, String category, String degree, Integer workload) {
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

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }
}
