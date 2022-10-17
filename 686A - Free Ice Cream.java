package javaapplication85;
import java.util.Scanner;
public class JavaApplication85 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long ans=0;
       long n=sc.nextLong();
        long r=sc.nextLong();
       while(n-->0){
           String c=sc.next();
             long d=sc.nextLong();
             if(c.charAt(0)=='+'){
                 r+=d;
             }else if(d<=r){
                r-=d; 
             }else{
               ans++;  
             }
       }
        System.out.print(r+" "+ans);
         System.out.println();  
    }
    
}
