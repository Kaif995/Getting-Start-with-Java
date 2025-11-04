package firstProject; 
 
import java.util.Scanner;

public class marks_high_low_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		int id,highest,lowest,numSubjects;
		
		
		

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        System.out.print("How many subject marks you want to enter: ");
        numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];

        // Input marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Initialize highest and lowest with first mark
        highest = marks[0];
        lowest = marks[0];

        // Find highest and lowest
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Output
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    

        sc.close();
    

	    
	   
	    
	  }
	

	}


