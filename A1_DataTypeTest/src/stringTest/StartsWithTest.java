package stringTest;

public class StartsWithTest {
public static void main(String[] args) {
	String a="Vcentry";
	System.out.println(a.contains("Vcen"));
	System.out.println(a.startsWith("Vcen"));
	System.out.println("---------------------");
	System.out.println(a.contains("cen"));
	System.out.println(a.startsWith("cen"));
}
}
