package com.abes.hclhrms.entity;

public class Employee {
    private long emp_id;
    private String emp_name;
    private String designation;
    private String progStack;
    private String email;

    public Employee(long emp_id, String designation, String emp_name, String progStack, String email) {
        this.emp_id = emp_id;
        this.designation = designation;
        this.emp_name = emp_name;
        this.progStack = progStack;
        this.email = email;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public String getProgStack() {
        return progStack;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setProgStack(String progStack) {
        this.progStack = progStack;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
