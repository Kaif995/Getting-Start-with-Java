import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();

        double average = (mark1 + mark2 + mark3) / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Marks: " + average);

        if (average >= 50) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        sc.close();
    }
}
