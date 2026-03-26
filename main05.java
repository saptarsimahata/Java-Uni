import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String originalString = sc.nextLine();

        
        String modifiedString = originalString.replace('d', 'f');

        
        System.out.println("\n--- Results ---");
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        sc.close();
    }
}