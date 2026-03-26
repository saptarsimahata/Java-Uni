import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Tender Cost: ");
        cost = sc.nextDouble();
    }
}

public class main02 {
    public static void main(String[] args) {
        Tender[] tenders = new Tender[5];
        
        
        System.out.println("--- Enter Details for 5 Tenders ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nTender #" + (i + 1));
            tenders[i] = new Tender();
            tenders[i].accept();
        }

        
        int minIndex = 0;
        for (int i = 1; i < tenders.length; i++) {
            if (tenders[i].cost < tenders[minIndex].cost) {
                minIndex = i;
            }
        }

        
        System.out.println("\n--- Result ---");
        System.out.println("The company with the lowest tender cost is: " + tenders[minIndex].companyName);
        System.out.println("Minimum Cost: " + tenders[minIndex].cost);
    }
}