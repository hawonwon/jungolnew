package q633;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        W: while (true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");
            int i = sc.nextInt();
            System.out.println();


            

            switch (i){
                case 1 :
                  
                    System.out.println("Seoul");
                    System.out.println();
                    break;
                case 2 :
                  
                    System.out.println("Washington");
                    System.out.println();
                    break;
                case 3 :
                   
                    System.out.println("Tokyo");
                    System.out.println();
                    break;
                case 4 :
                   
                    System.out.println("Beijing");
                    System.out.println();
                    break;
                default:
                  
                    System.out.println("none");
                    System.out.println();
                    break W;


            }

        }
    }

}