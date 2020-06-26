import java.util.Random;
import java.io.*;
class Employeewage {
  	static int Totalsalary=0, TotalHours=0, TotalHours1 =0, Wage1=0, hours1=0 ,hours=0, Wage=0,Totalsalary1=0 ;
        static Random rand = new Random();
	//static int[] Companies = new int[8];
        static int[] Companies = {9,5,25,100,8,4,20,75};

	 public void employeeComputation() {
			for(int i=1; i<=20 && TotalHours < 100 ; i++) {
			int int_random = rand.nextInt(3);
			int comp = rand.nextInt(2);
			switch(int_random){
                        	case 0:
                                	//System.out.println("Employee is Present");
                                	if (comp == 0){
					//System.out.println("Wages: Rs," +Wage);
                                	Wage= Companies[0] * Companies[2];
					hours= Companies[0];
					}
					else{
						Wage1= Companies[4] * Companies[6];
						hours1=Companies[4];
					}
					break;
                        	case 1:
                                	//System.out.println("Employee HalfDay");
					 if (comp == 1){
                                        //System.out.println("Wages: Rs," +Wage);

					//System.out.println("Wages: Rs." +Wage);
                                	 Wage= Companies[1] * Companies[2];
                                        hours= Companies[1];
                                        }
                                        else{
                                                Wage1= Companies[5] * Companies[6];
                                                hours1=Companies[5];
                                        }
                                        break;
                        	case 2:
                                	System.out.println("Employee is Absent");
                                	break;
					}
				 Totalsalary=Totalsalary+(int)Wage;
				 TotalHours=TotalHours+(int)hours;
				Totalsalary1=Totalsalary1+(int)Wage1;
				TotalHours1=TotalHours1+(int)hours1;
				}
		}



	public static void main(String arg[]){

			System.out.println("Welcom to Employee Wages Computation");
			//static int[] Companies = new int[8];
                	//static int[] Companies = {9,5,25,100,8,4,20,75};


			Employeewage Emp = new Employeewage();

			Emp.employeeComputation();

			System.out.println("Monthly wages For TCS : RS." +Totalsalary);
			System.out.println("Number of Hours Employee worked in TCS :" +TotalHours);
			System.out.println("Monthly wages For Capgemini : RS." +Totalsalary1);
                        System.out.println("Number of Hours Employee worked in Capgemini :" +TotalHours1);

	}
}
