package q523;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i2 = sc.nextInt();
        int result, result2, result3, result4;
        result = (i > i2) ? 1  : 0;
        result2 = (i < i2) ? 1  : 0;
        result3 = (i >= i2) ? 1  : 0;
        result4 = (i <= i2) ? 1  : 0;
        System.out.println(i+" > "+i2+" --- "+result);
        System.out.println(i+" < "+i2+" --- "+result2);
        System.out.println(i+" >= "+i2+" --- "+result3);
        System.out.println(i+" <= "+i2+" --- "+result4);

    }
}



