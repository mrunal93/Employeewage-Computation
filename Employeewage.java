import java.util.Random;
class Employeewage {
	


	public static void main(String arg[]){
		System.out.println("Welcome to Employee Wage Computation");
		Random rand = new Random();
		int Wage =0;
		int WagePerHours = 20;
		int DayHours = 8;
		int parttime=4;
		int int_random = rand.nextInt(3);
		switch(int_random){
			case 0:
				System.out.println("Employee is Present");
				Wage=DayHours*WagePerHours;
				System.out.println("Wages: Rs," +Wage);
				break;
			case 1:
				System.out.println("Employee HalfDay");
				Wage=parttime*WagePerHours;
				System.out.println("Wages: Rs." +Wage);
				break;
			case 2:
				System.out.println("Employee is Absent");
				break;
				}




	}

}
