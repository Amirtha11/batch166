package textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A6_Task {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test1.txt");
		System.out.println(f.exists());
		if (!f.exists()){     //! - not
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		for(int i=0; i<10000; i++){
			bw.write("vcentry"+ i);
			bw.newLine();
		}
		bw.close();
	}

}
