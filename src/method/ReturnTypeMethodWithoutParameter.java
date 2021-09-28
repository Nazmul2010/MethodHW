package method;

public class ReturnTypeMethodWithoutParameter {
	
	
	public static void main(String[] args) {
		
		ReturnTypeMethodWithoutParameter quazi =new ReturnTypeMethodWithoutParameter();	

		quazi.doAddition();
		quazi.doSubtraction();	
		quazi.doMultiplication();	
		ReturnTypeMethodWithoutParameter.getName();	
		ReturnTypeMethodWithoutParameter.doGroupStudy();	
			
			
		}	
			
			
		public int doAddition() {
			int number1=5;
			int number2=2;
			int number3  =number1+number2;
			System.out.println("Two number of addition is : "+number3);
			return number3;
		}	
			
			
		public int  doSubtraction() {
			int number1=12;
			int number2=5;
			int number3  =number1-number2;
			System.out.println("Two number of subtractionis : "+number3);
			return number3;
		}		
			
			
			
		public double  doMultiplication() {
			int number1=78;
			double number2=12.52;
			double number3  =number1*number2;
			System.out.println("Two number of multiplication : "+number3);
			return number3;
		}		
			
		public static String getName() {
			double salary = 7000.50;	
			String name="Lounas";
			System.out.println("My Name is : "+name);
				return name ;
		}		
			
		public static String doGroupStudy() {
			int num = 55;	
			String topic=" Method";
			System.out.println("Our Group Study topic Name is :"+ topic);
				return topic ;
		}			
			
			
			
			
			

}
