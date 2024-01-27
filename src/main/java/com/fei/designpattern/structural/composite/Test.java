package com.fei.designpattern.structural.composite;

public class Test {

    public static void main(String[] args) {

        //创建CEO
        Employee ceo = new Employee("张三","1",20000L);

        //创建部门经理
        Employee management = new Employee("李四","2",10000L);

        //创建销售员
        Employee saller1 = new Employee("王五","3",5000L);
        Employee saller2 = new Employee("田七","3",5000L);

        //创建仓库管理员
        Employee store = new Employee("赵六","4",3000L);


        //添加层级关系
        ceo.add(management);

        management.add(saller1);
        management.add(saller2);
        management.add(store);

        System.out.println(ceo);
        for (Employee employee : ceo.getEmployeeList()) {
            System.out.println("部门编号: "+employee.getDeptno()+" 姓名: "+employee.getName()+" 薪资: "+employee.getSalary());

            for (Employee e : employee.getEmployeeList()) {
                System.out.println("部门编号: "+e.getDeptno()+" 姓名: "+e.getName()+" 薪资: "+e.getSalary());
            }
        }

    }
}
