package javaapplication93;

import java.util.Scanner;
public class JavaApplication93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int l=sc.nextInt();
        int r=sc.nextInt();
        int a=0,b=0;
       if(l*2<=r){
           a=l;
           b=l*2;
        }else{
            a=-1;
            b=-1;
        }
       
        System.out.println(a+" "+b);
    }
    }
    
}
