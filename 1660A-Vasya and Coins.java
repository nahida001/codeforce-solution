package javaapplication77;
import java.util.Scanner;
public class JavaApplication77 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int r=0;
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0){
                System.out.println(1);
                continue;
            }
            if(b==0){
                System.out.println(a+1);
                continue;
            }
            r=(b*2)+a+1;
            System.out.println(r);
            continue;
           }
      
           }         
}
