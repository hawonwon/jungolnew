package q524;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =  sc.nextInt();
        int i2 =  sc.nextInt();

        boolean b = i!=0;
        boolean b2 = i2!=0;

        System.out.println(b&b2);
        System.out.println(b|b2);


    }
}
