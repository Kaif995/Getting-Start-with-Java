public class stringMeth { 
    public static void main(String[] args) {
        String text = " Hello World! ";  

        System.out.println("Original: '" + text + "'");
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Replaced: " + text.replace("World", "Java"));
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 1: " + text.charAt(1));
      
    }
}
