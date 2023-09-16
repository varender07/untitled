import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();

        int totalterm=5;
        int a= 0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n-2 ; i++) {
            int th= a+b;
            System.out.println(th);

            a=b;
            b=th;
            
        }
    }
}
