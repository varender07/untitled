
import java.util.Scanner;
public class percentagecalcucation {
    public static void main(String[] args) {
     float total = 0;
        System.out.println("WELCOME  TO THE CBSE PERCENTAGE MAKER");
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER TOTAL MARKS OF THE SUBJECT(EG:-73,69 ETC)");
        int total_marks = input.nextInt();
        System.out.println("ENTER THE MARKS OF SUBJECT 1:");
        float s1 = input.nextFloat();
        total = total + s1;
        System.out.println("ENTER THE MARKS OF SUBJECT 2:");
        float s2 = input.nextFloat();
        total = total + s2;
        System.out.println("ENTER THE MARKS OF SUBJECT 3:");
        float s3 = input.nextFloat();
        total = total + s3;
        System.out.println("ENTER THE MARKS OF SUBJECT 4:");
        float s4 = input.nextFloat();
        total = total + s4;
        System.out.println("ENTER THE MARKS OF SUBJECT 5:");
        float s5 = input.nextFloat();
        total = total + s5;
        System.out.println("ENTER THE MARKS OF SUBJECT 6:");
        float s6 = input.nextFloat();
        total = total + s6;
        float grandTotal = total * 100 / (total_marks*6);
        System.out.println("YOUR TOTAL PERCENTAGE " + grandTotal + "%");
        System.out.println("THANK YOU FOR VISITING");

    }
}
