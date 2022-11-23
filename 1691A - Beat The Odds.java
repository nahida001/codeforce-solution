package javaapplication120;
import java.util.Scanner;
public class JavaApplication120 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
              int t=sc.nextInt();
             while(t-->0){
                  int even=0;
                  int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }for(int i=0;i<n;i++){
                    if(arr[i]%2==0){
                        even++;
                         }
                 }
                 System.out.println(Math.min(even, n-even));
            }
             }
    }
