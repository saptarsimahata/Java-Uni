class Book {
    String title;
    String author;
    double price;

    
    Book() {
        this.title = "Generic Title";
        this.author = "Anonymous";
        this.price = 0.0;
    }

   
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 5.0; 
    }

    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Book: " + title + " by " + author + " [Price: $" + price + "]");
    }
}


public class main2 {
    public static void main(String[] args) {
        
       
        Book b1 = new Book(); 
        Book b2 = new Book("Hitchhiker's Guide", "Douglas Adams");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", 12.50);

        
        System.out.println("--- Library Inventory ---");
        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
    }
}