package recallCollection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add(" first array a");
		a.add(" first array b");
		a.add(" first array c");
		a.add(" first array d");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add(" first array a");
		b.add(" first array b");
		b.add(" first array c");
		b.add(" first array d");
		
		ArrayList<String> c = new ArrayList<String>();
		c.add(" first array a");
		c.add(" first array b");
		c.add(" first array c");
		c.add(" first array d");
		
		ArrayList<String> d = new ArrayList<String>();
		d.add(" first array a");
		d.add(" first array b");
		d.add(" first array c");
		d.add(" first array d");
		
		ArrayList<ArrayList<String>> combineArray = new ArrayList<ArrayList<String>>();
		combineArray.add(a);
		combineArray.add(b);
		combineArray.add(c);
		combineArray.add(d);
		
		for (int i=0;i<combineArray.size();i++) {
			String firstValueOfEachArray=combineArray.get(i).get(0);
			String secondValueOfEachArray=combineArray.get(i).get(1);
			String thirdValueOfEachArray=combineArray.get(i).get(2);
			String fourthValueOfEachArray=combineArray.get(i).get(3);

		}
	}
}
