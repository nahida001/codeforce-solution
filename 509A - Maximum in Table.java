
package javaapplication105;

import java.util.Scanner;
public class JavaApplication105 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[10][10];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                   arr[i][j]=1;
                }
                else if(j==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
      int s= arr[n-1][n-1];
        System.out.println(s);
    }
    }
    

