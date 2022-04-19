package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {

		System.out.println("Student Name is: " + name);

		if (name.equals("Sandeep")) {
			try {
				int marks = 10 / 5;
				//System.exit(1);  //shut down Java
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception is there...");
				return 80;
			}
			finally {
				System.out.println("Bye");
				return 90;
			}
			//return 100;
		} else if (name.equals("Dhrumil")) {
			return 80;
		} else if (name.equals("Murari")) {
			return 49;
		} else {
			System.out.println("Student Record doesn't exist...");
			return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1 = getMarks("Sandeep");
		System.out.println(m1);
	}

}
