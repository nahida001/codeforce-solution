package javaapplication75;

import java.util.Scanner;
public class JavaApplication75 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int n=s.length();
       int ans=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(s.charAt(i)=='Q'&&s.charAt(j)=='A'&&s.charAt(k)=='Q'){
                       ans++;
                   }
               }
           }
       }
        System.out.println(ans);
    }
       }
    
    

