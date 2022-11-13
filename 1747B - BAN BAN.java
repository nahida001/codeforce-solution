package javaapplication117;

import java.util.Scanner;

public class JavaApplication117 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
              int t=sc.nextInt();
              while(t-->0){
                  int a=0,b=0;
                  int n=sc.nextInt();
                  System.out.println((n+1)/2);
              for(int i=0;i<(n+1)/2;i++){
                  a=(i*3)+1;
                  b=3*(n-i);
              }
              assert(a<b);
              System.out.println(a+" "+b);
              
              }
    }
    
}
