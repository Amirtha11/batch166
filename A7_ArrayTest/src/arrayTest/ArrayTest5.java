package arrayTest;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a=new int[3][3];
// first row 
// row =0, coloumn= 0,1,2

a[0][0]=10;
a[0][1]=20;
a[0][2]=30;
//second row 
//row =1, coloumn= 0,1,2

a[1][0]=40;
a[1][1]=50;
a[1][2]=60;
//third row 
//row =2, coloumn= 0,1,2

a[2][0]=70;
a[2][1]=80;
a[2][2]=90;

System.out.println("total row size: " + a.length);
System.out.println("total column size: "+ a[0].length);
for(int i=0; i<a.length; i++){
	for(int j=0; j<a[i].length; j++){
	System.out.print(a[i][j] +" ");
}
System.out.println( );	
}
	
	}

}
