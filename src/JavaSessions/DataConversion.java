package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "12.33";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		String p = "AA100A";
		System.out.println(p+20);
		
//		int a = Integer.parseInt(p); // NumberFormatException
//		System.out.println(a+20); 

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int t = 100;
		System.out.println(t+20);
		
		// Integer to String conversion:
		String tt = String.valueOf(t);
		System.out.println(tt+20);
		
		boolean flag = true;
		String fl = String.valueOf(flag);
		System.out.println(fl);
		
		if(fl.equals("true")) {
			System.out.println("Hiiiii");
		}
		
		String msg = "welcome to \"Java\" world";
		
		System.out.println(msg);
	}

}
