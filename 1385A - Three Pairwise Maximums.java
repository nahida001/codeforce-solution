package javaapplication96;

import java.util.Scanner;

public class JavaApplication96 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int temp=0;
        int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
       if(x>y){
         temp=x;
         x=y;
         y=temp;
       }
       if(x>z){
         temp=x;
       x=z;
       z=temp;
       }
       if(y>z){
           temp=y;
           y=z;
           z=temp;
       }
       if(y==z){
           System.out.println("YES");
           System.out.println(x+" "+x+" "+z);
       }else{
           System.out.println("NO");
       }
       }
    }
    
}
