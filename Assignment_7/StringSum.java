package Assignment_6;

public class StringSum {

	public static void main(String[] args) {
		int sum = 0;
		String s = new String("67, 89, 23, 67, 12, 55, 66");
		
		String ar[] = s.split(", ");
		
		for(String str:ar)
		{
			sum = sum + Integer.parseInt(str);
		}
		System.out.println("sum : "+sum);
	}

}
