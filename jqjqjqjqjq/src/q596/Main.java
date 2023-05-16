package q596;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i  = sc.nextInt();
//        System.out.println(s.length());
        if(s.length()<i){
            for(int n=s.length()-1;n>=0;n--){
                System.out.print(s.charAt(n));
            }
        }else{
            int cnt =1;
            for(;i>0;i--){
                System.out.print(s.charAt(s.length()-cnt));
                cnt++;
            }
        }

    }
}