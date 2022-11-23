package javaapplication124;

import java.util.Scanner;
public class JavaApplication124 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              int k2=sc.nextInt();
               int k3=sc.nextInt();
               int k5=sc.nextInt();
               int k6=sc.nextInt();
               int a=0,e=0;
               a=Math.min(k2,Math.min(k5, k6));
               k2-=a;
               k5=-a;
               k6=-a;
               e=Math.min(k2, k3);
               System.out.println((a*256)+(e*32));
    }
    
}
