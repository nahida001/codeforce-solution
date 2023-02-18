
package javaapplication23;

import java.util.Scanner;
public class JavaApplication23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
         long mini=Long.MAX_VALUE;
        long n=sc.nextLong();
        long s=0;
         for(int i=0;i<n;i++){
           long x=sc.nextLong();
                mini=Math.min(mini,x);
                System.out.println(mini);
                s+=x;
              //  System.out.println(s);
            }
            long ans=s-n*mini;
            System.out.println(ans);
        }
    }
    
}
