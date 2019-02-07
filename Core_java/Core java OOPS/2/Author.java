package proj1;

public class Author {
	
	static String name;
	static String email;
	static char gender;
	public Author(String name, String email, char gender) 
	{
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getName() 
	{
		return name;
	}
	public char getGender() 
	{
		return gender;
	}
	@Override
	public String toString()
	{
		return "Author [name= " + name + "email=" + email + "Gender= " + gender + "]";
	}
	
}
