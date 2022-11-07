package javaapplication106;

import java.util.Scanner;
public class JavaApplication106 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      long c1=1,r=1,s=0,re=0;
      long a=sc.nextLong();
      long b=sc.nextLong();
       s=Math.min(a, b);
      for(long i=s;i>0;i--){
          r*=i;
      }
    System.out.println(r);
    }
    
}
