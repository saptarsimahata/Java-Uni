import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        
        String[] words = input.split(" ");

       
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            
            
            if (i > 0) {
                System.out.print(" ");
            }
        }
        
        System.out.println(); 
        sc.close();
    }
}