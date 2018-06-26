package record;



import java.util.ArrayList;
import java.util.Scanner;



public class Student 
{
int rollNo,age;
String name;
ArrayList<Student> a=new ArrayList<Student>();
	public Student(int rollNo, String name, int age) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	// TODO Auto-generated constructor stub
}
	public void addRecords(Student s)
	{
	
a.add(s);
/*System.out.println(a);*/
	}
	public void deleteRecords(Student s)
	{
		a.remove(s);
	
	}
	
	public void display()
	{
		System.out.println(a);
	}
	public String toString()
	{
		 return rollNo+" "+name+" "+age;   
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Roll no");
		int rollNo=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
		Student s=new Student(rollNo,name,age);
		s.addRecords(s);
		s.display();
		
	}}