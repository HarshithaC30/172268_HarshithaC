package proj1;

import java.util.Arrays;

public class Student1 extends Person {

	private int numCourses=0;
	private String[] courses = new String[30];
	private int[] grades = new int[30];
	
	public Student1(String name, String address) {
		super(name, address);
	}

	@Override
	public String toString() {
		return "Student1 [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}
	
	public void addCourseGrade(String course,int grade){
		for(int i=0;i<courses.length;i++) {
			if (courses[i]==null){
			    grades[i]=grade;
			    courses[i]=course;
			    break;
			   }
			 else{
				i++;
		      }
	}
  }
	
	public void printGrades() {
		for(int i=0;i<courses.length;i++) {
			if(courses[i]!= null) {
				System.out.println("course: "+ courses[i] + " grade: "+ grades[i]);
			}
		}
	}
	
	public double getAverageGrade() {
		int n=0;
	    int sum=0;
	    for(int i=0;i< courses.length;i++){
	        if (courses[i]!=null){
	            sum=sum+grades[i];
	            n++;
	        }
	    }
	    return sum/n;

	}
	
}
