package LoopsAssignments;

public class Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A3: WAP to print 10 to 1 using for, while and do-while loop

		System.out.println("Using For Loop: ");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Using While Loop: ");
		int k = 10;
		while (k > 0) {
			System.out.println(k);
			k--;
		}

		System.out.println("Using Do while Loop: ");

		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j > 0);

	}

}
