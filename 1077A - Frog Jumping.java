package javaapplication125;

import java.util.Scanner;
public class JavaApplication125 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         long t=sc.nextInt();
         while(t-->0){
              long a=sc.nextInt();
               long b=sc.nextInt();
                long k=sc.nextInt();
               long ans=0,d=0;
               if(k%2==1){
                   d=(k/2)+1;
               }else{
                   d=k/2;
               }System.out.println((d*a)-((k-d)*b));
    }
    }  
}
