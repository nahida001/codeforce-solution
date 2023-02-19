package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long t=sc.nextLong();
       while(t-->0){
           int c=0,ans=0;
           long n=sc.nextLong();
           for(long i=0;i<n;i++){
               long a=sc.nextLong();
               if(a>1){
                  c++; 
               }else{
                   ans++;
                   if(ans>=2){
                       ans=0;
                       c++;
                   }
               }
           }
           c+=ans;
           System.out.println(c);
       }
    }
    
}
