package javaapplication122;

import java.util.Scanner;
public class JavaApplication122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              long a=sc.nextLong();
              long b=sc.nextLong();
              long c=sc.nextLong();
              long l1=0,l2=0,l3=0,l4=0;
        l1=(a*2)+(b*2);
        l2=a+b+c;
        l3=(a*2)+(c*2);
        l4=(b*2)+(c*2);
        System.out.println(Math.min(l1, Math.min(l2, Math.min(l3, l4))));
                
               
    }
    
}
