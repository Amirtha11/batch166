package textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A5_BufferedAppendContentTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test1.txt");
		System.out.println(f.exists());
		if (!f.exists()){     //! - not
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f,true); // true-append
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("vcentry1");
		bw.newLine();
		bw.write("vcentry2");
		bw.newLine();
		bw.write("vcentry3");
		bw.newLine();
	
		bw.close();
	
	}

}
