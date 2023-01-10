
package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int x=sc.nextInt();
           int arr[]=new int[3];
           int a=sc.nextInt();
            int b=sc.nextInt();
             int c=sc.nextInt();
           for(int i=1;i<3;i++){
               arr[1]=a;
                arr[2]=b;
                 arr[3]=c;
               }
           int ans=0;
           for(int i=1;i<3;i++){
               if(arr[x]==0){
                  ans=1;
                  break;
               }
               x=arr[x];
           }if(ans==0){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
           }
       }
    
    
}
