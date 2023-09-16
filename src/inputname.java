
import java.util.Scanner;
public class inputname {
    public static void main(String[] args) {
        System.out.println("WHAT IS YOUR NAME?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("HELLO " + name + " HAVE A GOOD DAY");
    }
}
