package learningTest;

public class PalindromeOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1911;
		int reversednum=0;
		int originalnum=num;
		int remainder;
		
		while(num!=0){
			remainder =num%10;
			reversednum =reversednum*10+remainder;
			num/=0;                     //divide num(3553) by 0 and store the result in num
			
		}
		
	}

}
