package stringLiteraltest;

public class StringLiteralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Vcentry"; //string literals
String b="Vcentry";
String c= new String("Vcentry"); //string objects
String d= new String("Vcentry");
System.out.println(a==b);
System.out.println(b==c);
System.out.println(c==d);
System.out.println("-------------------");
System.out.println(a.equals(b));
System.out.println(b.equals(c));
System.out.println(c.equals(d));



	}

}
