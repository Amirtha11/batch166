package sampleTest;

public class SampleTest extends Thread {
public void run(){
	for(int i=0; i<10; i++){
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleTest s1= new SampleTest();
SampleTest s2= new SampleTest();
SampleTest s3= new SampleTest();
SampleTest s4= new SampleTest();
/*s1.run();
s2.run();
s3.run();
s4.run();*/

s1.start();
s2.start();
s3.start();
s4.start();


	}

}
