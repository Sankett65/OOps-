package com.bridgelabz.oops3;

public class Employee {
    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static void swap(Employee e1,Employee e2){
        String temp = e1.getEmpName();
       e1.setEmpName(e2.getEmpName());
       e2.setEmpName(temp);

       int temp1= e1.getEmpId();
       e1.setEmpId(e2.getEmpId());
       e2.setEmpId(temp1);

    }
}


class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sanket",1);
        Employee e2 = new Employee("Rohit",2);
        Employee.swap(e1,e2);
        System.out.println("Name:" +e1.getEmpName()+
                "\nId: "+e1.getEmpId());
        System.out.println("\nName:" +e2.getEmpName()+
                "\nId: "+e2.getEmpId());


    }
}
