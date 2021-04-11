package variableA;

public class VariableTest1 {
// public static int i=5; // global variable
// public static int j=5;
  //static int i=5;  // static/class level variable
  //static int j=5;
	 int i=5;  //instance variable
	 int j=5;  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i=1;
//int j=1;
		VariableTest1 v = new VariableTest1();
		
int k=v.i+v.j;

	}
public static void add(){
	int k=i+j;
	System.out.println(k);
	
}
}
