package java_programming;

public class TodayWorkOopsconcepts {
	// class and object

	static class Employee {

		int rollNO;
		String name;
		String address = "maduai";

		public static void main(String[] args) {

			Employee abc = new Employee(); // here we creating of an object
			// for accessing the object variable ..
			System.out.println("address is " + abc.address);
			System.out.println("name is " + abc.name); // if we didn't assume the value is taken is null values
			System.out.println("rollno is " + abc.rollNO);

		}
	}

}
