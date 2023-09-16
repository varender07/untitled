
import java.sql.SQLOutput;
import java.util.Scanner;

public class chapter3 {
    public static void main(String[] args) {
        /*
          String name="varender";
          String name2="varender";
          System.out.println(name==name2 );
        */
        /*
          int a = 6;
          float b =5.6454f;
          System.out.printf("THE VALUE OF a IS %d and VALUE OF b IS %f",a ,b);
          //[ %d-int & %f-float & %c-char & %s-string]
        */
        /*
          Scanner sc = new Scanner(System.in);
          String st = sc.next(); // only first letter of line.
          String st = sc.nextLine(); // full line.
          System.out.println(st);
        */
        /*
           String name ="Varender";
           System.out.println(name);
           int value = name.length(); //number of words
           System.out.println(value);
        */
        /*
           String name ="Varender Singh";

           String lstring = name.toLowerCase(); //ALL LETTERS TO LOWER CASE
           System.out.println(lstring);

           String ustring = name.toUpperCase(); //ALL LETTERS TO UPPER CASE
           System.out.println(ustring);
         */
         /*
           String name ="Varender Singh";


           String nonTrimmedString ="   Varender Singh    ";
           System.out.println(nonTrimmedString);

           String trimmedString =nonTrimmedString.trim();
           System.out.println(trimmedString);
         */
         /*
           String name ="Varender";
           //STARTING OF LETTERS
           System.out.println(name.substring(4)); //ALL LETTER FROM SUBSTRING LETTER[which we give eg:-2,4,5,etc(varender-01234567)] ARE PRINTED.

           String name ="Varender";
           //STARTING & ENDING OF LETTERS
           System.out.println(name.substring(2,7)); // LAST LETTER IS BEFORE THE GIVEN LETTER
         */
         /*
           String name ="varender";
           //REPLACE ANY LETTER OF WORD
           System.out.println(name.replace('v','r'));
           System.out.println(name.replace("va","ra"));
         */
         /*
           String name ="varender";
           //CHECK STATEMENT TRUE OR FALSE
           System.out.println(name.startsWith("va")); // STARTING
           System.out.println(name.endsWith("der")); //ENDING
         */
         /*
           String name ="varender";
           //POSITION OF WORD (eg:varender-01234567)
           System.out.println(name.charAt(3));
         */
         /*
           String name ="varenderder";

           System.out.println(name.indexOf("rend"));// SHOWS FIRST LETTER'S NUMBER OF WORD.
           System.out.println(name.indexOf("der",7));//IN THIS WE DEFINE A NUMBER AFTER WHICH WE FIND THE WORD.
           // NO MATCH FOUND IT GIVE VALUE = -1.
         */
         /*
           String name ="varenderder";

           System.out.println(name.lastIndexOf("e")); //RETURN THE LAST INDEX OF THE GIVEN STRING
           System.out.println(name.lastIndexOf("e",5)); //RETURN THE LAST INDEX OF THE GIVEN STRING BEFORE INDEX
        */
        /*
          String name ="varender";
          System.out.println(name.equals("varender"));//RETURN TRUE IF THE GIVEN STRING IS EQUAL TO "VARENDER" , FALSE OTHERWISE
          System.out.println(name.equalsIgnoreCase("varEnder"));//RETURN TRUE IF TWO STRING ARE EQUAL IGNORING THE CASE OF CHARACTERS.(eg:in this if we give "varender",it is true otherwise in all case it is false) & ALSO IS IGNORE THE CASE OF UPPER OR LOWRE FORM OF LETTER.
        */
        /*
          //ESCAPE SEQUENCE CHARACTERS{ \n-newline,\t-tab,\'-singlequate,\"-doublequate,\\-backslash etc }
          System.out.println(" I am in B.Tech\\B.E");
        */

          // PRACTICE SET:-3
        /*
        //PROBLEM:1 :-WRITE A PROGRAM TO CONVERT A STRING TO LOWERCASE.
          String name ="jack parker";
          name = name.toLowerCase();
          System.out.println(name);
        */
        /*
        //PROBLEM:2:-WRITE A PROGRAM TO REPLACE SPACE WITH UNDERSCORES.
          String name ="jack parker";
          String text ="TO LOWER CASE";
          text = text.replace(" ","_");
          System.out.println(text);
        */
        /*
        //PROBLEM:3:-WRITE JAVA PROGRAM TO FILL IN A LETTER TEMPLATE WHICH LOOKS LIKE BELOW: letter="Dear <|name|>,Thanks a lot"  -- Replace <|name|> with a String(some name).
          String letter="Dear <|name|>,\nThanks a lot";
          letter = letter.replace("<|name|>","varender");
          System.out.println(letter);
        */
        /*
        //PROBLEM:4:-WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACE.
          String dtString ="THIS STRING CONTAINS  DOUBLE AND   TRIPALE SPACES";
          System.out.println(dtString.indexOf("  "));
          System.out.println(dtString.indexOf("   "));
          // IF RETURN IS "-1" THEN,IT MEANS DOUBLE/TRIPLE SPACE IS NOT AVAILABLE.
        */
        /*
        //PROBLEM:5:-WRITE A PROGRAM TO FORMAT THE FOLLOWING LETTER USING ESCAPE SEQUENCE CHARACTERS.  letter= " Dear varender, This java cource is nice. Thanks"
          String myletter = "Dear varender,\nThis java cource is nice.\nThanks";
          System.out.println(myletter);
        */

    }

}
