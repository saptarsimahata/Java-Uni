class MathOperations {

    
    int multiply(int a, int b) {
        return a * b;
    }

    
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    
    double multiply(double a, double b) {
        return a * b;
    }
}

public class main5 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Java matches the call to the correct method signature
        System.out.println("Result 1 (2 ints): " + math.multiply(5, 10));        
        System.out.println("Result 2 (3 ints): " + math.multiply(5, 10, 2));    
        System.out.println("Result 3 (2 doubles): " + math.multiply(5.5, 2.0)); 
    }
}