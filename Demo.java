public class Demo {
    void ShowArray(){
        int[] a = {10, 20, 30, 40};
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.ShowArray();
    }
}
                