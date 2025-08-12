package aggregationExample;

public class Student {
int st_id;
String student_name;

Student(int st_id,String student_name )
{
	
this.st_id = st_id;
this.student_name =  student_name;
}

public void displayInfo()
{
System.out.println("***Student detailss***");	
System.out.println("ID :" +st_id);	
System.out.println("Name: " +student_name);	



}
}
//purpose Same as inheritance 