package mit.assignments.fooCorp;

public class FooCorporation {
	
	public static void totalPay(String empName, double basePay, int hoursWorked) {
		if(basePay < 8.00) {
			System.out.println("Base pay too low, at least $8.00 per hour.");
			return;
		}
		if(hoursWorked > 60) {
			System.out.println("Too much hours worked, at most 60 hours.");
			return;
		}
		
		double totPayed = 0.00;
		
		if(hoursWorked > 40)
			totPayed = (40 * basePay) + ((hoursWorked - 40) * (basePay * 1.50));
		else
			totPayed = (hoursWorked * basePay);
		
		System.out.println(empName + "'s salary is $" + totPayed);
	}

	public static void main(String[] args) {
		totalPay("Employee1", 7.50, 35);
		totalPay("Employee2", 8.20, 47);
		totalPay("Employee3", 10.00, 73);
	}

}

