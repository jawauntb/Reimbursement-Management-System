package com.projects.reimbursementsystem.DAOs;

import java.util.List;
import com.projects.reimbursementsystem.POJOs.RefundableExpense;
import com.projects.reimbursementsystem.POJOs.Employee;



public interface RefundableExpenseDao {


    public boolean checkEmpty();
    public int totalRefundableExpense();
    public boolean checkRefundableExpense(int rex_id);


    public void addRefundableExpense(RefundableExpense rex);
    public int editRefundableExpense(RefundableExpense rex);
    public void deleteRefundableExpense(int id);
    public void deleteRefundableExpense(RefundableExpense rex);

    public int getAmountByEid(int e_id);
    public Employee getEmployeeByRid(int rex_id);


    public List<RefundableExpense> getAllRefundableExpense ();
    public List<RefundableExpense> getAllRefundableExpenseUser(int e_id);
}
