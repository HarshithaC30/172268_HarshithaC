package proj1;
public class Customer 
{
	String name;
	static boolean member=false;
	static String memberType;
	public Customer()
	{
		
	}
	
	public Customer(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		System.out.println(name);
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setMember(boolean member) 
	{
		this.member = member;
	}

	public static String getMemberType() 
	{
		System.out.println("Type of member is: " +memberType);
		return memberType;
	}

	public void setMemberType(String memberType) 
	{
		this.memberType = memberType;
	}
	
	public static boolean isMember()
	{
		if(member==false)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}

	
}
