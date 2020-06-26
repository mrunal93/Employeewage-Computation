import java.util.Random;
import java.io.*;
import java.util.*;
import java.util.Scanner;
class Employeewage {
  	static int Totalsalary=0,TotalHours=0,Wage=0,hour=0;
        static String Company, comp;
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	//static int[] Companies = new int[8];

	 public void  employeeComputation(String Company, int empRatePerHr, int numOfWorkingDay, int MaxHoursPerMonth) {
			int totalWorkingDays = 0;
			while (TotalHours <= MaxHoursPerMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			int int_random = rand.nextInt(3);
			switch(int_random){
			  	case 0:
                                	System.out.println("Employee is Present");
                                	Wage=8*empRatePerHr;
					hour=8;
					System.out.println("Wages: Rs," +Wage);
                                	break;
                        	case 1:
                                	System.out.println("Employee HalfDay");
                                	Wage=4*empRatePerHr;
					hour=4;
					System.out.println("Wages: Rs." +Wage);
                                	break;
                        	case 2:
                                	System.out.println("Employee is Absent");
                                	break;
					}
				 Totalsalary=Totalsalary+(int)Wage;
				 TotalHours=TotalHours+(int)hour;

				}
			System.out.println("Monthly Wages For "+Company + " is : Rs. " +Totalsalary);

			System.out.println("Monthly Hours For "+Company + " is :  " +TotalHours);
		}

	public static void main(String arg[]){

			System.out.println("Welcom to Employee Wages Computation");

			System.out.println("Enter The number of Company:");
			int a=sc.nextInt();
			for(int i=0; i<=a; i++){
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
