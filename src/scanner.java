
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("TAKING INPUT FROM THE USER");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("ENTER NUMBER 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b ;
        System.out.println("THE SUM OF THESE NUMBER IS:");
        System.out.println(sum);

    }

}
