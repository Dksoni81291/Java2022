package FinalizeConcept;

public class Company {
	
	String name;

	public static void main(String[] args) {
		
		Company c = new Company();
		
		c = null;
		// c.name = "Amdocs";
		
		Emp e = new Emp();
		e = null;
		
		System.gc();
		
	}
	
	@Override
	public void finalize() {
		System.out.println("Company Finalize method...");
	}

}
