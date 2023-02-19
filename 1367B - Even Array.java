
package javaapplication20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication20 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      long t=sc.nextLong();
       while(t-->0){
          int n=sc.nextInt();
          int arr[]=new int[n];
           for(int i = 0; i <n; i++){
              arr[i]=sc.nextInt();
               }
           int even=0,odd=0;
           for(int i = 0; i <n; i++){
                 if(i%2 != arr[i] % 2){
                       if(arr[i] % 2 == 1){
                           odd++;
                       }else{
                           even++;
                       }
                 }
           }
             if(odd != even){
                 System.out.println(-1);
             }else{
                 System.out.println(even);
             }
       }
    }
    
}
