import java.util.Scanner;

class Point {
    double x, y;

    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point center; 

    Circle(double r, double x, double y) {
        this.radius = r;
        this.center = new Point(x, y); 
    }

    double calculateArea() {
        
        return Math.PI * Math.pow(radius, 2);
    }

    void display() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Center Point (x, y): (" + center.x + ", " + center.y + ")");
        System.out.printf("Area of Circle: %.2f\n", calculateArea());
    }
}

public class main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter X coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter Y coordinate: ");
        double y = sc.nextDouble();

        
        Circle myCircle = new Circle(r, x, y);

        
        myCircle.display();
        
        sc.close();
    }
}