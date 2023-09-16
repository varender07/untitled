import java.util.Scanner;

public class chapter4 {
    public static void main(String[] args) {

        /*
          //IF-ELSE STATEMENT
          //(!=-NOT EQUALS)
          int age = 4;
          if(age>18){
                     System.out.println("YES,\nYou can drive.");
          }
          else{
               System.out.println("NO,\nYou can not drive.");
          }
        */
        /*
          boolean a = true;
          boolean b = false;
          boolean c = true;
          if(a && c || b) {
              System.out.println("Yes");//(&&-THIS ONLY GIVE 'YES' WHEN ALL THE BOOLEAN ARE TRUE.)
          }
            else {
              System.out.println("No");
          }
        */
        /*
          int age ;
          System.out.println("ENTER YOUR AGE");
          Scanner sc = new Scanner(System.in);
          age = sc.nextInt();
          if (age>56){
              System.out.println("YOU ARE EXPERIENCED!");
          }
          else if(age>46){
              System.out.println("YOU ARE SEMI-EXPERIENCED!");
          }
          else if (age>36) {
              System.out.println("YOU ARE SEMI-SEMI-EXPERIENCED");
          }
          else{
              System.out.println("YOU ARE NOT EXPERIENCED");
          }
        */
        /*
        //SWITCH CONDITION

          int age;
          System.out.println("ENTER YOUR AGE");
          Scanner sc = new Scanner(System.in);
          age = sc.nextInt();

          switch (age) {
              case 18:
                  System.out.println("YOU ARE GOING TO BECOME AN ADULT!");
                  break;
              case 23:
                  System.out.println("YOU ARE GOING TO JOIN A JOB!");
                  break;
              case 60:
                  System.out.println("you are going to get retired!");
                  break;
              default:
                  System.out.println("ENJOY YOUR LIFE!");
              }
          System.out.println("THANKS FOR USING ");
        */

        //PRACTICE SET
        /*
        // Q1:WHAT WILL BE THE OUTPUT OF THIS PROGRAM {int a=10;  if(a=11) sout("I AM 11")  else   sout("I AM NOT 11")}
          int a=14;
          if(a==11) {
              System.out.println("I AM 11");
          }
          else {
              System.out.println(" I NOT AM 11");
          }
        */
        //Q2:WRITE A PROGRAM TO FIND OUT WHEATHER A STUDENT IS PASS OR FAIL,IF IT REQUIRES TOTAL 40% AND AT LEAST 33% IN EACH SUBJECTTO PASS. ASSUME 3 SUBJECT AND TAKE MARKS AND TAKE MARKS FRON THE USER.
        /*
          int m1,m2,m3 ;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter your marks in physics");
          m1= sc.nextInt();
          System.out.println("enter your marks in chemistry");
          m2= sc.nextInt();
          System.out.println("enter your marks in maths");
          m3= sc.nextInt();

          int avg = (m1+m2+m3)/3;
          if ( m1>=33 && m2>=33 && m3>=33 && avg>=40){
              System.out.println("you are passed  ");
          }
          else{
              System.out.println("good luck for next time");
          }
        */
        /*
        //Q3:CALCULATE INCOME TAX PAID BY AN EMPLOYEE TO THE GOVERNMENT AS PER THE SLAGS MENTIONED BELOW:( 2.5-5L 5% & 5-10L 20% & ABOVE 10L 30% )

         Scanner sc = new Scanner(System.in);
         System.out.println("enter your income in lakhs");
         float tax = 0 ;
         float income = sc.nextFloat();
         if(tax<2.5){
             tax = tax + 0;
         }
         if(income>2.5f && income<5f){
             tax = tax + 0.05f * (income - 2.5f);
         }
         else if(income>5f && income<10.0f){
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (income - 5f);
         }
         else if(income>10.0f){
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (10.0f - 5f);
             tax = tax + 0.3f * (income - 10.0f);
         }
             System.out.println("THE TOTAL TAX PAID BY THE EMPLOYEE IS: " + tax);
       */
       /*
         //Q4:WRITE A JAVA PROGRAM TO FIND OUT THE DAY OF THE WEEK GIVEN THE NUMBER[ 1 FOR MONDAY, 2 FOR TUSEDAY .... AND 50 ON !]
          Scanner sc = new Scanner(System.in);
          int day = sc.nextInt();
          switch(day){
            case 1: System.out.println("MONDAY");
            break;
            case 2: System.out.println("TUESDAY");
            break;
            case 3: System.out.println("WEDNESDAY");
            break;
            case 4: System.out.println("THURSDAY");
            break;
            case 5: System.out.println("FRIDAY");
            break;
            case 6: System.out.println("SATURDAY");
            break;
            case 7: System.out.println("SUNDAY");
            break;
          }
       */




    }
}
