import java.util.Random;
import java.io.*;
class Employeewage {
  	static int Totalsalary=0, TotalHours=0, WagePerHours =20, DayHours =8, parttime=4 ,hours=0, Wage=0 ;
        static Random rand = new Random();
        //static int int_random = rand.nextInt(3);


	 public void employeeComputation() {
		//int Totalsalary=0, TotalHours=0, WagePerHours =20, DayHours =8, parttime=4 ,hours=0, Wage=0 ;
        	//Random rand = new Random();
        	//int int_random = rand.nextInt(3);
			for(int i=1; i<=20 && TotalHours < 100; i++) {
			int int_random = rand.nextInt(3);
			switch(int_random){
                        	case 0:
                                	System.out.println("Employee is Present");
                                	Wage=DayHours*WagePerHours;
					hours=DayHours;
					System.out.println("Wages: Rs," +Wage);
                                	break;
                        	case 1:
                                	System.out.println("Employee HalfDay");
                                	Wage=parttime*WagePerHours;
					hours=parttime;
					System.out.println("Wages: Rs." +Wage);
                                	break;
                        	case 2:
                                	System.out.println("Employee is Absent");
                                	break;
					}
				 Totalsalary=Totalsalary+(int)Wage;
				 TotalHours=TotalHours+(int)hours;
				}
		}



	public static void main(String arg[]){

                        //int Totalsalary=0;
                        //int TotalHours=0;
                        //int WagePerHours = 20;
                        //int DayHours = 8;
                        //int parttime=4;
			Employeewage Emp = new Employeewage();

			Emp.employeeComputation();

			System.out.println("Monthly wages are : RS." +Totalsalary);
			System.out.println("Number of Hours Employee worked :" +TotalHours);
	}
}
