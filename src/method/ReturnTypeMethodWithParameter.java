package method;

public class ReturnTypeMethodWithParameter {



	

	

public static void main(String[] args) {
	
ReturnTypeMethodWithParameter simun =new ReturnTypeMethodWithParameter();	
	
simun.doAddition(25, 10);	
simun.doSubtraction(125.25, 52.23 , 6.33);	
simun.doMultiplicationValueUsingFourNumber(15, 8.33, 50, 10.25);
ReturnTypeMethodWithParameter.getJobDetails("Scrum Master", 100000.00);	
ReturnTypeMethodWithParameter.isTicketAvailable("ticket", 'D', 50);
	
	
	
}	
	
	
public int doAddition(int number1, int number2) {
	int number3  =number1+number2;
	System.out.println("Two Number of Addition : "+number3);
	return number3;
}	

public double doSubtraction(double number1, double number2, double number3) {
	double calculation=number1-number2-number3;
	System.out.println("Three Numbers of subtraction : "+calculation);
	return calculation;
}

public double doMultiplicationValueUsingFourNumber(int num1, double num2, int num3, double num4) {
	double calculation=num1*num2*num3*num4;
	System.out.println("Four Numbers of multiplication : "+calculation);
	return calculation;
}

public static String getJobDetails(String jobname, double salary) {
	

	System.out.println("Job  Name : "+jobname);

	return jobname ;
}

public static boolean isTicketAvailable(String ticket, char day, int price) {
	
	char dayticket=day;
	int ticketPrice=price;
	
	
		System.out.println("Yes the movie ticket is avaialable");
	
	
	
	
	return dayticket=='D';
}

}
