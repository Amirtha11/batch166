package stringLiteraltest;

public class StringBuilderBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
i++;
System.out.println(i);
int j=1;
j=j+1;
System.out.println(j);

String a="vcentry";
System.out.println(a.concat("technologies"));
//a.concat("technologies"); // not possible bcoz string is immutable
//System.out.println(a);
	}

}
