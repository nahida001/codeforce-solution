
package javaapplication150;

import java.util.Scanner;

public class JavaApplication150 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long t=sc.nextLong();
       while(t-->0){
          int a=sc.nextInt();
           if(a==1){
               System.out.println(a+1);
           }
           else if(a%3!=0){
               int c=a/3+1;
               System.out.println(c);
           }else{
               int c=a/3;
               System.out.println(c);
           }
       }
    }
    
}
