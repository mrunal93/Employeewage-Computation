import java.util.Random;
class Employeewage {
	public static void main(String arg[]){
		System.out.println("Welcome to Employee Wage Computation");
		Random rand = new Random();
		int Present = 3;
		int WagePerHours = 20;
		int DayHours = 8;
		int parttime=4;
		int int_random = rand.nextInt(Present);
		if( int_random == 1){
			System.out.println("Employee is Present");
			int DailyWage=DayHours*WagePerHours;
			System.out.println("Wages:" +DailyWage);
			}
		else if ( int_random == 2){
			System.out.println("Employee HalfDay");
			int DailyWage=parttime*WagePerHours;
			System.out.println("Wages: "+DailyWage);
			}

		else{
			System.out.println("Employee is Absent");
			}

	}


}
