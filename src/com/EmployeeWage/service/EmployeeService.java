package com.employeewage.service;
import com.employeewage.model.Employeewage;

import java.util.HashMap;
import java.util.*;
import java.io.*;
class EmployeeService{

	//int a , ewph ,nwd, hpm;
	 //String comp;
		  public static void main(String arg[]){
			 int a , ewph ,nwd, hpm;
		         String comp;

			int totalsalary=0, totalHours=0;
                        Scanner sc = new Scanner(System.in);
			System.out.println("Welcom to Employee Wages Computation");

                      System.out.println("Enter The number of Company:");
                      HashMap<String,Integer> companyEmployee = new HashMap<String,Integer>();
                       a=sc.nextInt();
                      for(int i=1; i<=a; i++){
                              System.out.println("Enter The Company name :");
                              comp = sc.next();
                              System.out.println("Enter Rate of wages Per Hour :");
                              ewph = sc.nextInt();

                              System.out.println("Enter The number of Working Day of Company:");
                              nwd = sc.nextInt();

                            System.out.println("Enter Max Hours Per Month Of company:");
                            hpm = sc.nextInt();

                        System.out.println("Enter The Company name :");
                        String Comp = sc.nextLine();

                              Employeewage Emp = new Employeewage();

                              Emp.employeeComputation(comp,ewph,nwd,hpm);
                              companyEmployee.put((String)comp ,(int)totalsalary);

              }
                      for (String j : companyEmployee.keySet()){

                      System.out.println("==Company Name : " +j + " ===Total Salary: Rs." +companyEmployee.get(j));
		 }
      }




}
