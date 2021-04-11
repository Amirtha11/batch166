package finalizeTest;

public class TaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="5a6b7cd123A-*+";
String b="5a6b7cd123A-*+";
// System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
String newa=  a.replaceAll("abc", "");
String newb= b.replaceAll("abc", "");
//System.out.println(newa);
//System.out.println(newb);
//System.out.println(Integer.parseInt(newa)+ Integer.parseInt(newb));

String rega= a.replaceAll("[a-zA-Z]", "");
String regb= b.replaceAll("[a-zA-Z]", "");

System.out.println(rega);
System.out.println(regb);
//System.out.println(Integer.parseInt(rega)+ Integer.parseInt(regb));
String numa= a.replaceAll("[0-9]", "");
String numb= b.replaceAll("[0-9]", "");
System.out.println(numa);
System.out.println(numb);

String numaa= a.replaceAll("[^0-9]", "");
String numbb= b.replaceAll("[^0-9]", "");
System.out.println(numaa);
System.out.println(numbb);
	}

}
