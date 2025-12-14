package firstProject;

public class PSEFS_demo {

	 public static void main(String[] args) {
		 
		 	System.out.println("Made By Muhammad Kaif Shamim!");
	        Person person = new Person("Muhammad");
	        Student student = new Student("Kaif", Student.SENIOR);
	        Employee employee = new Employee("Shamim");
	        Faculty faculty = new Faculty("Muhammad");
	        Staff staff = new Staff("Kaif");

	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());
	    }

}
