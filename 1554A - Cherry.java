package javaapplication127;

import java.util.Scanner;

public class JavaApplication127 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
              long t=sc.nextLong();
              while(t-->0){
               int n=sc.nextInt();
               long arr[]=new long[n];
               long ans=0,res=0;
               for(int i=0;i<n;i++){
                   arr[i]=sc.nextLong();
                   if(i>0){
                       ans=Math.max(ans,arr[i]*arr[i-1]);
                   }
               }
                  System.out.println(ans);
    }
    } 
}
