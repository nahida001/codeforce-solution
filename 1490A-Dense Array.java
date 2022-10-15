package javaapplication78;
import java.util.Scanner;
public class JavaApplication78 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n-1;i++){
               int mn=Math.min(a[i],a[i+1]);
                int mx=Math.max(a[i],a[i+1]);
                while(mx>mn*2){
                   mn*=2;
                   c++; 
                }
            } 
            System.out.println(c);
        }
      }
    }
