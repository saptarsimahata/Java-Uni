public class SwapNum {

    SwapNum(double x, double y) {
        System.out.println("Before swapping a = "+ x +" , b = "+ y);
        double temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping a = "+ x +" , b = "+ y);
    }
    
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        SwapNum obj = new SwapNum(a, b); 
    }
}