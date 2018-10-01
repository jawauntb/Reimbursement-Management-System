package com.projects.reimbursementsystem.POJOs;

public class RefundableExpense {

    private int rex_id; //expense id
    private int e_id; // employee id
    private String rexDate; // date of the expense
    private int expense_period; //end date of expense period
    private String location; //location of expense/purchase
    private String desc; //any further description of the expense
    private float price; // the total cost of the expense
    public enum ExpenseCategory {
        Meal, Travel, Housing, Misc;
    } //categories that are acceptable expenses to submit
    private ExpenseCategory category; //which category this expense falls into
    private String expense_admin_comment; //any comments from reimbursement administrator

    public RefundableExpense(int rex_id, int e_id, String rexDate, int expense_period, String location, String desc, float price,
                             ExpenseCategory category, String expense_admin_comment) {
        this.rex_id = rex_id;
        this.e_id = e_id;
        this.rexDate = rexDate;
        this.expense_period = expense_period;
        this.location = location;
        this.desc = desc;
        this.price = price;
        this.category = category;
        this.expense_admin_comment = expense_admin_comment;
    }

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


    public String getRexDate() {
        return rexDate;
    }

    public void setRexDate(String rexDate) {
        this.rexDate = rexDate;
    }

    public int getExpense_period() {
        return expense_period;
    }

    public void setExpense_period_end_date(int expense_period) {
        this.expense_period = expense_period;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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
                ", rexDate='" + rexDate + '\'' +
                ", expense_period='" + expense_period + '\'' +
                ", location='" + location + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", expense_admin_comment='" + expense_admin_comment + '\'' +
                '}';
    }
}
