package com.fei.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String deptno;
    private Long salary;

    private List<Employee> employeeList;

    public Employee(String name, String deptno, Long salary) {
        this.name = name;
        this.deptno = deptno;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
    }

    public void add(Employee e){
        employeeList.add(e);
    }

    public void remove(Employee e){
        employeeList.remove(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "姓名='" + name + '\'' +
                ", 部门编号='" + deptno + '\'' +
                ", 薪资=" + salary;
    }
}
