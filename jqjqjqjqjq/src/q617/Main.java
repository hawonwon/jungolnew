package q617;

import java.util.Scanner;

class Short {
    String name;
    int height;

    
    
    void person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    void plint() {
    	
    	System.out.println(this.name+" "+this.height);
    }
    
    

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Short[] s1 = new Short[5];
        Short ss = new Short();
        ss.person("x", Integer.MAX_VALUE);
        
        
//        int x = Integer.MAX_VALUE;
//        int y = 0;
        
        for(int i=0;i<5;i++){

                s1[i] = new Short();
                String n = sc.next();
                int h = sc.nextInt();
                 s1[i].person(n, h);
                 
            if(s1[i].height<ss.height){
                ss.person(s1[i].name,s1[i].height);
                
            }
        }
        ss.plint();
//        System.out.println(s1[y].name+" "+s1[y].height);
        

    }



}
