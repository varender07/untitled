public class PATTERN {
    public static void main(String[] args) {
        /*
        // star pattern
          for(int line=1; line<=10;line++){
              for (int star=1; star<=line; star++)
              { System.out.print("* ");}
              System.out.println();
              }
        */
        /*
        // inverted star pattern
          int n = 4;
            for(int line=1;line<=n; line++) {
                for(int star=line;star<=n-line+1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        */
        //number pattern
        int n=4;
        for (int line=1; line<=n; line++){
            for (int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
