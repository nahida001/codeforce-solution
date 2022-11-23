package javaapplication126;

import java.util.Scanner;

public class JavaApplication126 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while(t-->0){
              long a=sc.nextLong();
               long b=sc.nextLong();
                long c=sc.nextLong();
               long ans=0;
               ans=(a+b+c);
               System.out.println(ans/2);
    }
    } 
}
