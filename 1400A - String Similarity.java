
package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            for(int i=0;i<2*n-1;i=i+2){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
    
}
