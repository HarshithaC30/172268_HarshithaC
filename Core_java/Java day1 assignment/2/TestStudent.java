package proj1;
public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student s = new Student("Abc", "Bangalore");
		s.addCourseGrade("VLSI", 96);
		s.addCourseGrade("HDL", 95);
		s.addCourseGrade("Logic Design", 68);
		s.printGrades();
		System.out.println("Average Grade:"+s.getAverageGrade());
		System.out.println(s.toString());
	}

}
