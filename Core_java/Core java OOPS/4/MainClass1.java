package proj1;

public class MainClass1 {

	public static void main(String[] args) {
		Person p = new Person("ABC","46587");
		Student1 s=new Student1(p.getName(),p.getAddress());
		Teacher t=new Teacher(p.getName(),p.getAddress());

		s.addCourseGrade("java", 59);
		s.addCourseGrade("JEE", 90);
		s.addCourseGrade("C++", 68);
		s.addCourseGrade("asp.net", 70);
		
		s.printGrades();
		System.out.println("Average of all grade is "+s.getAverageGrade());
	}

}
