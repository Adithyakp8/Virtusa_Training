package com.sample;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 5 employee records");
		
		System.out.println("Enter Employee id of emp1");
		emp1.setEmpNo(sc.nextInt());
		System.out.println("Enter Employee Name of emp1");
		emp1.setEmpName(sc.next());
		System.out.println("Enter Employee Salary of emp1");
		emp1.setEmpSal(sc.nextInt());
		
		System.out.println("Enter Employee id of emp2");
		emp2.setEmpNo(sc.nextInt());
		System.out.println("Enter Employee Name of emp2");
		emp2.setEmpName(sc.next());
		System.out.println("Enter Employee Salary of emp2");
		emp2.setEmpSal(sc.nextInt());
		
		System.out.println("Enter Employee id of emp3");
		emp3.setEmpNo(sc.nextInt());
		System.out.println("Enter Employee Name of emp3");
		emp3.setEmpName(sc.next());
		System.out.println("Enter Employee Salary of emp3");
		emp3.setEmpSal(sc.nextInt());
		
		System.out.println("Displaying Values");
		
		System.out.println("Emp1_id:"+emp1.getEmpNo()+"\t"+"Emp1_name:"+emp1.getEmpName()+"\t"+"Emp1_Sal:"+emp1.getEmpSal());
		System.out.println("Emp1_id:"+emp2.getEmpNo()+"\t"+"Emp1_name:"+emp2.getEmpName()+"\t"+"Emp1_Sal:"+emp2.getEmpSal());
		System.out.println("Emp1_id:"+emp3.getEmpNo()+"\t"+"Emp1_name:"+emp3.getEmpName()+"\t"+"Emp1_Sal:"+emp3.getEmpSal());
		
		
		
		
		
		

	}

}
