package firstProject;
import java.util.Scanner; 
public class Main {

	
		  public static void main(String[] args) {
			int year;
			Scanner sc =new Scanner(System.in);
		    System.out.println("Enter Year To Check whether its leap year or not.");
		    year=sc.nextInt();
		    if (year % 400 == 0 || year % 100==0 || year %4==0 )
		    {
		    System.out.println(year+" Year is Leap Year!");
		    }
		    else {
		    System.out.println(year+" Year is not Leap year");
		    }
		    sc.close();
		  }
		

}
