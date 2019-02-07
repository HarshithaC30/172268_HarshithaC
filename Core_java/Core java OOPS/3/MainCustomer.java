package proj1;

public class MainCustomer {

	public static void main(String[] args) {
		Customer1 c1=new Customer1(01,"Harsh",15);
		System.out.println(c1);
		Account1 a=new Account1();
		a.setBalance(490.367328);
		a.credit(5000.3789);
		System.out.println(a);
		a.withdraw(1000.2390);
		System.out.println(a);
	}

}
