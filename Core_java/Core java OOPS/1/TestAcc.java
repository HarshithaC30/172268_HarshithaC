package proj1;
public class TestAcc
{
	public static void main(String[] args) 
	{
		Account a1=new Account("123", "Harsh");
		a1.Credit(1000);
		a1.Debit(1500);
		a1.transferTo(12345432, 500);
		System.out.println(a1.toString());
		
	}

}
