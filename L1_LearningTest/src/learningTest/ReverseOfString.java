package learningTest;

public class ReverseOfString {
	
	public static void main(String[] args) {
		
		/* StringBuilder sb= new StringBuilder("banana");
		sb.reverse();
		System.out.println(sb); */
		
		
		
		String str = "banana";
		  String revString = "";

		  for (int i = str.length() - 1; i >= 0; i--) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);
		 }
		
		
		
	}
	


