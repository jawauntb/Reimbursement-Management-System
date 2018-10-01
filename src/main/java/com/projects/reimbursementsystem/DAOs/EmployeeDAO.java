package com.projects.reimbursementsystem.DAOs;

import java.util.List;
import com.projects.reimbursementsystem.POJOs.Employee;


public interface EmployeeDAO {

    public boolean checkEmpty ();
    public int totalEmployees();
    public boolean checkUniqueUsername(Employee employee);
    public boolean checkUniqueUsername(String name);
    public boolean checkUniqueId(Employee employee);

    public void addEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployee(String username);
    public Employee getEmployee(int e_id);
    public int checkCredentials (String u, String p);

    public List<Employee> getAllEmployees ();
    public List<Employee> getAllManagers ();
    public List<Employee> getAllDepartmentHeads ();

    public void reimburseAmount (int price , int e_id);
    public int getAmount(int e_id);
    public void refreshAmount();


}
