package com.projects.reimbursementsystem.POJOs;

public class RefundableExpense {

    private int rex_id; //expense id
    private int e_id; // employee id
    private String first_name; // employee first name
    private String last_name; // employee last name
    private String rexDate; // date of the expense
    private String expense_period_end_date; //end date of expense period
    private String location; //location of expense/purchase
    private String desc; //any further description of the expense
    private int price; // the total cost of the expense
    public enum ExpenseCategory {
        Meal, Travel, Housing, Misc;
    } //categories that are acceptable expenses to submit
    private ExpenseCategory category; //which category this expense falls into
    private String expense_admin_comment; //any comments from reimbursement administrator


    public int getRex_id() {
        return rex_id;
    }

    public void setRex_id(int rex_id) {
        this.rex_id = rex_id;
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

    public String getRexDate() {
        return rexDate;
    }

    public void setRexDate(String rexDate) {
        this.rexDate = rexDate;
    }

    public String getExpense_period_end_date() {
        return expense_period_end_date;
    }

    public void setExpense_period_end_date(String expense_period_end_date) {
        this.expense_period_end_date = expense_period_end_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public String getExpense_admin_comment() {
        return expense_admin_comment;
    }

    public void setExpense_admin_comment(String expense_admin_comment) {
        this.expense_admin_comment = expense_admin_comment;
    }

    @Override
    public String toString() {
        return "RefundableExpense{" +
                "rex_id=" + rex_id +
                ", e_id=" + e_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rexDate='" + rexDate + '\'' +
                ", expense_period_end_date='" + expense_period_end_date + '\'' +
                ", location='" + location + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", expense_admin_comment='" + expense_admin_comment + '\'' +
                '}';
    }
}
