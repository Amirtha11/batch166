package propertyFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\src\\propertyFileTest\\Test.properties");
FileInputStream fis = new FileInputStream(f);
Properties prop = new Properties();
prop.load(fis);
System.out.println(prop.get("username"));

Enumeration e = prop.keys();
while(e.hasMoreElements()){
	String key = (String) e.nextElement();
	System.out.println(key);
 }
	}

}
