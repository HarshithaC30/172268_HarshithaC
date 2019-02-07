package proj1;
public class Student 
{
	private String name;
	private String address;
	private int numCourses=0;
	private String[] courses;
	private int[] grades;
	public Student(String name, String address) 
	{
		super();
		this.name = name;
		this.address = address;
		this.courses=new String[30];
		this.grades=new int[30];
	}
	
	public String getName() 
	{
		return name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", address=" + address + "]";
	}
	public void addCourseGrade(String courses,int grade)
	{
		this.courses[numCourses]=courses;
		this.grades[numCourses]=grade;
		numCourses++;
	}
		
	public void printGrades()
	{
		System.out.println(name);
		for(int i=0;i<numCourses;i++)
		{
			System.out.println(courses[i]+":"+grades[i]);
		}
	}
	public double getAverageGrade()
	{
		int sum=0;
		for(int i=0;i<numCourses;i++)
		{
			sum=sum+grades[i];
		}
		return sum/numCourses;
		
	}
	
}
