class ReverseNum {
    public static void main(String[] args) {
        int num = 17;
        int prev = num;
        int rev = 0;
        while (num != 0){
            int temp = num%10;
            rev = rev*10+temp;
            num = num/10;
        }

        System.out.println("If we reverse "+ prev + " we get "+ rev);
    }
}
