import java.util.Scanner;
public class Ders11 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		person person=new person("peter","kazýmkarabekir");
		student student=new student("susan","kazýmkarabekir");
		employee employee=new employee("eva","kazýmkarabekir");
		faculty faculty=new faculty("frank","kazýmkarabekir");
		staff staff=new staff("shane","kazýmkarabekir");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}

}

class person{
	protected String name;
	protected String address;
	protected String phonenumber;
	protected String email;
	
	person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	
	public String getAdress() {
		return address;
	}
	
	@Override
		public String toString() {
			return "person: " + name +" adresi: "+ getAdress() ;
		}
}   
    

    class student extends person{
    	public static int FRESHMAN=1;
    	public static int SOPHOMORE=1;
    	public static int JUNÝOR=1;
    	public static int SENÝOR=1;
    	
    	protected int status;
    	
    	student(String name,String address){
    		super(name,address);
    		
    		
    	}
    	
    	@Override
    	public String toString() {
    		return "Student: "+ getName()+" adresi: "+getAdress();
    	}
    }

        class employee extends person{
        	protected String office;
        	protected int salary;
        	protected java.util.Calendar dateHired;
        	
        	employee(String name,String address){
        		super(name,address);
        	}
        	
        	@Override
        	public String toString() {
        		return "employee: "+ getName()+ " adresi: "+getAdress();
        	}
        }

        class faculty extends employee{
        	public static int LECTURE=1;
        	public static int ASSÝSTANT_PROFESSOR=2;
        	public static int ASSOCIATE_PROFESSOR=3;
        	public static int PROFESSOR=4;
        	
        	protected String officeHours;
        	protected int rank;
        	
        	faculty(String name,String address){
        		super(name,address);
        	}
        	
        	@Override
        	public String toString() {
        		return "faculty: "+ name + " adresi: "+getAdress();
        	}
        }

        class staff extends employee{
        	protected String title;
        	
        	staff(String name,String address){
        		super(name,address);
        	}
        	
        	@Override
        	public String toString() {
        		return "staff: "+ getName()+" adresi: "+getAdress();
        	}
        }

















