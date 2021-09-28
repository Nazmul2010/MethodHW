package method;

public class NonReturnTypeMethodWithParameter {
	
	public static void main(String[] args) {
		NonReturnTypeMethodWithParameter mahmud = new NonReturnTypeMethodWithParameter();

		NonReturnTypeMethodWithParameter.doAddition(2, 25);
		NonReturnTypeMethodWithParameter.doSubtraction(15, 5);
		NonReturnTypeMethodWithParameter.doMultiplication(10, 2);
		mahmud.doDivision(15, 3);
		mahmud.doRemainder(300.00, 27.00);

	}
	

	public static void doAddition(int number1, int number2) {
		int addition = number1 + number2;
		System.out.println("Two number of addition : " + addition);

	}

	public static void doSubtraction(int number1, int number2) {
		int subtraction = number1 - number2;
		System.out.println("Two number of subtraction : " + subtraction);

	}

	public static void doMultiplication(int number1, int number2) {
		int multiply = number1 * number2;
		System.out.println("Two number of Multiplication : " + multiply);

	}

	public void doDivision(int number1, int number2) {
		int division = number1 / number2;
		System.out.println("Two number of division : " + division);

	}

	public void doRemainder(double number1, double number2) {
		double remainder = number1 % number2;
		System.out.println("Two number of remainder : " + remainder);

	}


}
