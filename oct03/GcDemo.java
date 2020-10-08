//package oct03;

public class GcDemo {

	public static void main(String[] args) {
		String s = new String("abc");
		String s1 = new String("abcghj");
		System.out.println(s);
		System.out.println(s1);	
		String s3 = "krishna";
		s3.concat(" patil");
		String s4 = s3.concat(" patil");
		//s1 = s3;
		
		System.out.println(s4);	
		s = null;
		System.out.println(s);
		System.out.println(s1);	
//		String s3 = s1;
		s1 = s;	
		System.out.println(s);
		System.out.println(s1);	
		System.out.println("===");
		
	}

	
}
