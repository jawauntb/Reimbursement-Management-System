package com.projects.reimbursementsystem.POJOs;

public class Employee {

    private int e_id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String email;
    private String dob;
    private String address;
    private String city;
    private String state;
    private String role;
    private int manager_id;
    private float total_expense;
    private float expense_limit;

    public Employee(int e_id, String first_name, String last_name, String username,
                    String password, String email, String dob, String address, String city,
                    String state, String role, int manager_id, float total_expense, float expense_limit) {
        this.e_id = e_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.state = state;
        this.role = role;
        this.manager_id = manager_id;
        this.total_expense = total_expense;
        this.expense_limit = expense_limit;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public float getTotal_expense() {
        return total_expense;
    }

    public void setTotal_expense(float total_expense) {
        this.total_expense = total_expense;
    }

    public float getExpense_limit() {
        return expense_limit;
    }

    public void setExpense_limit(float expense_limit) {
        this.expense_limit = expense_limit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", role='" + role + '\'' +
                ", manager_id=" + manager_id +
                ", total_expense=" + total_expense +
                ", expense_limit=" + expense_limit +
                '}';
    }


}