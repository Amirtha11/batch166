package textFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A7_ReadFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\File\\Test1.txt");
		System.out.println(f.exists());
		if (!f.exists()){     //! - not
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("vcentry1");
		bw.newLine();
		bw.newLine();
		bw.write("vcentry2");
		bw.newLine();
		bw.write("vcentry3");
		bw.close();
		
		// read file test
		
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		// System.out.println(br.read());
		/* System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine()); */
		
		String x="";
		while ((x =br.readLine()) !=null){
			System.out.println(x);
		}
	}
	
	
	
	
	
	}


