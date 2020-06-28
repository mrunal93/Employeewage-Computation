package com.EmployeeWage.service;

import com.employeewage.model.Employeewage;

public class EmployeeService{

	static int a , ewph ,nwd, hpm;
	static String comp;
		public static void main(String arg[]){

                        System.out.println("Welcom to Employee Wages Computation");

                        System.out.println("Enter The number of Company:");
                        int a=sc.nextInt();
                        for(int i=1; i<=a; i++){
                                System.out.println("Enter The Company name :");
                                comp = sc.next();
                                System.out.println("Enter Rate of wages Per Hour :");
                                int ewph = sc.nextInt();

                                System.out.println("Enter The number of Working Day of Company:");
                                int nwd = sc.nextInt();

                                System.out.println("Enter Max Hours Per Month Of company:");
                                int hpm = sc.nextInt();

                        //System.out.println("Enter The Company name :");
                        //String Comp = sc.nextLine();

                                Employeewage Emp = new Employeewage();

                                Emp.employeeComputation(comp,ewph,nwd,hpm);

                        //System.out.println("Monthly wages For TCS : RS." +Totalsalary);
                        //System.out.println("Number of Hours Employee worked in TCS :" +TotalHours);
                        //System.out.println("Monthly wages For Capgemini : RS." +Totalsalary1);
                        //System.out.println("Number of Hours Employee worked in Capgemini :" +TotalHours1);
                        }
        }



}
