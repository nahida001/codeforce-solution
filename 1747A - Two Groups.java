package javaapplication121;

import java.util.Scanner;
public class JavaApplication121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              int t=sc.nextInt();
              long sub=0;
             while(t-->0){
                  long sum1=0,sum2=0;
              int n=sc.nextInt();
              int arr[] = new int[n];
              for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
                    sum1=sum1+arr[i];
                
              }
         
                 System.out.println(Math.abs(sum1));
                   }          
                }       
}
