package encapsulationTest2;

public class SbiTest {
private int balance=1000;

public void setBalance(int balance){
	System.out.println("you are requested debit amount:" +balance);
	
	this.balance = this.balance-balance;
	
}

public int getBalance(){
	return balance;
	
}

}
