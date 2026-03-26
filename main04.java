import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int spaces = 0;

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        
        System.out.println("\n--- String Statistics ---");
        System.out.println("Uppercase characters : " + upperCase);
        System.out.println("Lowercase characters : " + lowerCase);
        System.out.println("Digits               : " + digits);
        System.out.println("Spaces               : " + spaces);
        
        sc.close();
    }
}