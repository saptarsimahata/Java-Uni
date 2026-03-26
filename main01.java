import java.util.Scanner;

class Item {
    private int code;
    private double price;

    
    public void inputDetails(int itemNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering details for Item " + itemNumber);
        System.out.print("Enter Code: ");
        this.code = sc.nextInt();
        System.out.print("Enter Price: ");
        this.price = sc.nextDouble();
    }

    
    public double getPrice() {
        return price;
    }

    
    public void displayRow() {
        System.out.printf("%-10d | %-10.2f%n", code, price);
    }
}

public class main01 {
    public static void main(String[] args) {
        
        Item[] items = new Item[5];
        double total = 0;

        
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(); 
            items[i].inputDetails(i + 1);
            total += items[i].getPrice();
        }

        
        System.out.println("\n--- INVENTORY REPORT ---");
        System.out.printf("%-10s | %-10s%n", "ITEM CODE", "PRICE");
        System.out.println("---------------------------");

        for (Item it : items) {
            it.displayRow();
        }

        System.out.println("---------------------------");
        System.out.printf("%-10s | %-10.2f%n", "TOTAL", total);
    }
}