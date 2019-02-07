package proj1;
public class MainClass 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		Visit v = new Visit();
		
		c.setName("Abc");
		c.getName();
		
		c.setMember(true);
		
		c.setMemberType("Gold");
		c.getMemberType();
		
		System.out.println(c.toString());
		
		v.setServiceExpense(1000);
		v.setProductExpence(1000);
		System.out.println(v.getTotalExpense());
	}

}
