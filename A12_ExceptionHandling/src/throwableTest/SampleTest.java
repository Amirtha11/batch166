package throwableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SampleTest {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
int i= 1/1;
// String j= "1"/"5";
int j= 1/0;
File f = new File("");
FileInputStream fis = new FileInputStream(f);
Thread.sleep(1000);
	}

}
