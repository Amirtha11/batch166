package forTest;

public class ForTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="vcentry";
		String output="";
		for(int i=a.length()-1; i>=0; i--){
			//System.out.print(a.charAt(i));
			output=output+a.charAt(i);
	}
		System.out.println(output);
	}
}
