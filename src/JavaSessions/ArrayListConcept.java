package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		// ArrayList is the Ordered based collection.
		// Dynamic Array		
		
		al.add(100);
		al.add(200);
		
		System.out.println("Size of the arrayList is "+al.size());
		
		al.add(300);
		al.add(400);
		
		System.out.println("Current Size of the ArrayList is "+al.size());
		
		al.add(12.33);
		al.add("h");
		al.add(true);
		al.add("Testing");
		
		System.out.println(al.size());
		
		
		System.out.println(al.get(al.size()-1));
		
		// System.out.println(al.get(-1)); //IOB
		// System.out.println(al.get(8)); //IndexOutOfBoundException
		
		ArrayList al1 = new ArrayList(5);
		
		// System.out.println(al1.get(5)); //IOB
		
		System.out.println("Get all the elements of ArrayList and Iteration mechanism");
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("====================");
		for(Object AR : al) {
			System.out.println(AR);
		}
		
		
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(100);
		markList.add(200);
		//markList.add("Hello");
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Dhrumil");
		empData.add(1211);
		empData.add("Active");
		empData.add("M");
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Dhrumil");
		namesList.add("Soni");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		 numbers.add(100); //0 
		 numbers.add(200); //1
		 numbers.add(300); //2
		 numbers.add(400); //3s
		 	
//		System.out.println(numbers.get(2));
//		
//		System.out.println("Before");
//		System.out.println(numbers.size());
//		System.out.println(numbers.remove(2));
//		
//		System.out.println("After");
//		System.out.println(numbers.size());
//		System.out.println(numbers.get(2));
		
		 System.out.println(numbers.get(3));
		numbers.add(3, 500); 
		System.out.println(numbers.get(3));
		
		int i[] = new int[4];
		i[2]=10;
		System.out.println(i[2]);
		System.out.println(i[0]);
		
		int j[]= {10,20,30,40,50}; // Static Array Literals
		System.out.println(j[3]);
		System.out.println(j.length);
		j[0]=200;
		System.out.println(j[0]);
		
		// Length is used with Array and Size() method used with ArrayList
		
		
	}

}
