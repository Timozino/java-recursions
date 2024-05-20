public class Main{
    public static void main(String[] args){
        int num = 3;
        System.out.println(factorials(num));
        System.out.println(powerOfTwo(num));
        System.out.println(fibonacci(num));
        System.out.println(factorials(5));
    }
    public static int factorials(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorials(n-1);
        }
    }
    public static int powerOfTwo(int n){
        if (n==0){
            return 1;
        }else{
            return 2*powerOfTwo(n-1);

        }

    }
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}