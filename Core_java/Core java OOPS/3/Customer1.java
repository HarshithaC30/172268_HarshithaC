package proj1;

public class Customer1 {

	static int id;
	static String name;
	static char gender;
	static int discount;
	public Customer1(int id, String name, int discount) 
	{
		super();
		this.id = id;
		this.name = name;
		this.discount=discount;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString()
	{
		return name + "( " + id + ")";
	}
	
	
	
}
