package test.string;

public class Containsm {

	public static void main(String[] args) {
		
		String S1 ="ram";
		String S2 = " ";
		String S3 ="ragul";
		String S4 ="vjiay";
		String S5 ="kumar";
		
		System.out.println(S1.contains("ragul"));
		System.out.println(S3.contains("ra"));

		
		//equals method 
		
		System.out.println(S2.equals(S5));
		
  
		//replace method
		
		System.out.println(S5.replace("kumar", "sam"));
		System.out.println(S5.replace("k", "s"));
		
		
		
		//Emptymethod
		
		if(S2.isEmpty())
		{
			System.out.println("it is empty");
		}
		
		else {
			System.out.println("it is not empty");
		}
		
		
		
		
	}

}
