package javaapplication28;

import java.util.Scanner;
public class JavaApplication28 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          long t=sc.nextLong();
       while(t-->0){
             long n=sc.nextLong();
             long m=1;
             for(long i=1;i<50;i++){
                 m=2*m+1;
                 if(n%m!=0){
                    continue; 
                 }
                 System.out.println(n/m);
                 break;
             }
       }
    }
    
}
