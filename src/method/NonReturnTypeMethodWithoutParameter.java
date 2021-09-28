package method;

public class NonReturnTypeMethodWithoutParameter {
	
	
	public static void main(String[] args) {

		NonReturnTypeMethodWithoutParameter shanto = new NonReturnTypeMethodWithoutParameter();
		NonReturnTypeMethodWithoutParameter.getName();
		NonReturnTypeMethodWithoutParameter.getAge();
		NonReturnTypeMethodWithoutParameter.getPersonalInformation();
		shanto.getProfessionalInformation();
		shanto.getAddressInformation();

	}


	public static void getName() {

		String name = "Nazmul Tanvir";
		System.out.println("My Name is :" + name);

	}

	public static void getAge() {
		int age = 26;
		System.out.println("I am " + age + " " + "years old");

	}

	public static void getPersonalInformation() {
		String gender = "Male";
		System.out.println("Gender:" + " " + gender);
	}

	public void getProfessionalInformation() {

		String Profession = "QA Analyst";
		double Salary = 115000.00;

		System.out.println("My Job title : " + Profession);
		System.out.println("Salary: " + Salary);

	}

	public void getAddressInformation() {

		int HouseNumber = 8533;
		String RoadName = "160 ST";
		String City = "Jamaica";
		String State = "New York";
		int Zipcode = 11432;
		System.out.println("My House Number : " + HouseNumber);
		System.out.println("Road Name : " + RoadName);
		System.out.println("City: " + City);
		System.out.println("State: " + State);
		System.out.println("Zipcode: "+ Zipcode);

	}
	
	
	
	
	
	
	
	

}
