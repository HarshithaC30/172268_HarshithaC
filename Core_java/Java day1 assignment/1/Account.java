package proj1;
public class Account 
{
		private String id;
		private String name;
		private int bal=0;
		public Account(String id, String name) 
		{
			super();
			this.id = id;
			this.name = name;
		}
		public Account(String id, String name, int bal) {
			super();
			this.id = id;
			this.name = name;
			this.bal = bal;
		}
		public String getId() 
		{
			return id;
		}
		public String getName() 
		{
			return name;
		}
		public int getBal() 
		{
			return bal;
		}
		public int Credit(int amt)
		{
			bal=bal+amt;
			System.out.println("Amount" + bal + "added");
			return bal;
		}
		public int Debit(int amt)
		{
			if(amt<=bal)
			{
				bal=bal-amt;
			System.out.println("AMount" + bal + "withdrawed");
			}
			else
				System.out.println("Amount exceeded balance");
			return bal;
		}
		public int transferTo(Object Account,int amt)
		{
			if (amt<=bal)
				System.out.println(amt + "Transfered amount to the given account");
			else
				System.out.println("Amount exceeded balance");
			return bal;
		}
		@Override
		public String toString() 
		{
			return "Account [id=" + id + ", name=" + name + ", bal=" + bal + "]";
		}
		
		

}
