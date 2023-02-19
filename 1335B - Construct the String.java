package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
       while(t-->0){
          int n=sc.nextInt();
          int a=sc.nextInt();
          int b=sc.nextInt();
         char ch[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
        
         StringBuilder s1=new StringBuilder();
             for(int i=0; i<b; i++){
                s1.append(ch[i]);//s[i]=ch[i]
             }
             int r=0;
             while(n-->0){
                 System.out.print(s1.charAt(r));
                 r++;
                 if(r==b){
                     r=0;
                 }
             }
             System.out.println();
       }
    }
    
}
