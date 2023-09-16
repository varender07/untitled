public class chapter5 {
    public static void main(String[] args) {
      /*
      //WHILE LOOP
        int i = 1;
        while(i<=7){
            System.out.println(i);
           i++;
        }
        System.out.println("FINISH RUNNING WHILE LOOP!");
      */
      /*
      //DO WHILE
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a<=5);
      */
      /*
      //FOR LOOP
        int i;
        for(i=1; i<=10; i++){
            System.out.println(i);
        }
      */
      /*
      //WRITE A PROGRAM TO PRINT FIRST N ODD NUMBERS USING A FOR LOOP.

        for (int n = 0; n<5;n++){
              System.out.println(2*n+1);
          }
      */

      //break and continue using loops!
        for (int i=0; i<5; i++) {

            if(i==3){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

      /*
        int i=0;
        while(i<5){
            System.out.println("i");
            System.out.println("java is great");
            if (i == 4) {
                System.out.println("ending the loop");
                break;
            }
            i++;
        }
        System.out.println("loop ends here");
      */


      // PRACTICE SET
      /* //Question:1
        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
      */
      /*
      //Question:2 :- WAP to sum first n even number using while loop.

        int sum=0;
        int n=4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even numbers is: ");
        System.out.println(sum);
      */
      /*
      //Question:3:-WAP to print multiplication table of a given number n.

        int n =5;
        for(int i=1;i<=10;i++){
            System.out.println("%d X %d = %d",n ,i,n*i);
        }
      */

      //QUESTION:4:- WAP to
    }
}
