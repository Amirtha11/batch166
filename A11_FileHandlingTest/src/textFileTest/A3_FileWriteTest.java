package textFileTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3_FileWriteTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test1.txt");
		System.out.println(f.exists());
		if (!f.exists()){     //! - not
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f);
		fw.write("vcentry1 ");
		fw.write("vcentry2");
		fw.close();
	}

}
