class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }

    
    double add(double a, double b) {
        return a + b;
    }
}

public class main4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println("Adding 2 ints: " + calc.add(10, 20));        
        System.out.println("Adding 3 ints: " + calc.add(10, 20, 30));      
        System.out.println("Adding 2 doubles: " + calc.add(10.5, 20.5));   
    }
}