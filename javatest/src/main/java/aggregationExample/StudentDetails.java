package aggregationExample;

public class StudentDetails {
     String place;
     String country;
     Student obj;
     StudentDetails(String place ,String country ,Student obj) 
     {
    	this.place= place;
    	this.country = country;
    	this.obj= obj;
    	 
     }
     public void display()
     {
    	 
    	 System.out.println("***Address***");
    	 System.out.println("Place:" +place);
    	 System.out.println("Country:" +country);
    	 obj.displayInfo();
     }
     
	public static void main(String[] args) {
		
    Student s = new Student(50,"Swetha");
    StudentDetails s1 = new StudentDetails("Thodupuzha","India",s);
    		s1.display();
	}

}
