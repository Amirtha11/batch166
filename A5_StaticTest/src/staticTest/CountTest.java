package staticTest;

public class CountTest {
public static int i=0; 
//public  int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CountTest c1=new CountTest();
CountTest c2=new CountTest();
CountTest c3=new CountTest();
c1.increment();
c2.increment();
c3.increment();
	}
public void increment(){
	i++;
	System.out.println(i);
}
}
