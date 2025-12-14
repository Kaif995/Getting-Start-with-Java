package firstProject;

public class Butterflypattern {
	public static void main(String[] args) {

        System.out.println("Made By Muhammad Kaif Shamim!");
		int n = 4;
        
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
