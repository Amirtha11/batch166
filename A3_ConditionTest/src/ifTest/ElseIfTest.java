package ifTest;

public class ElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19; 
		String country="Aus";
		  if(age>18){
			  System.out.println("allow to vote");
		  }
		  else if(country.equals("Aus")){
			  System.out.println("He is Aus, allowed to vote");
		  }
		  else{
			  System.out.println("under 18");
		  }
		  
	}

}
