import java.util.Random;
class Employeewage {
	public static void main(String arg[]){
		System.out.println("Welcome to Employee Wage Computation");
		Random rand = new Random();
		int Present = 2;
		int WagePerHours = 20;
		int FullDayHours = 8;
		int int_random = rand.nextInt(Present);

		if( int_random == 1){
			System.out.println("Employee is Present");
			int DailyWage=FullDayHours*WagePerHours;
			System.out.println("Wages:"+DailyWage);
		}
		else{
			System.out.println("Employee is Absent");
		}

	}


}
