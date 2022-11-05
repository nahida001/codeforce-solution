package javaapplication91;
import java.util.Scanner;
public class JavaApplication91 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
       int res=0,ans=0;
        int n=sc.nextInt();
           if(n%2==1){
               ans=n/2;
               System.out.println(ans+1);
           }else if(n%2==0){
               res=n/2;
               System.out.println(res);
           }
       } 
    }
    
}
