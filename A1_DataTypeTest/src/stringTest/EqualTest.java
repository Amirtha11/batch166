package stringTest;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Vcentry";
String b="Vcentry";
String c="vcentry";
String d=new String("Vcentry");

System.out.println(a==b);
System.out.println(a.equals(b));
System.out.println(a==d);
System.out.println(a.equals(d));
System.out.println("----------------------");
System.out.println(a.equals(c));
System.out.println("----------------------");
System.out.println(a.equalsIgnoreCase(c));
	}

}
