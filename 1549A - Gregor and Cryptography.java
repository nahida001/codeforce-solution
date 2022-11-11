package javaapplication110;

import java.util.Scanner;

public class JavaApplication110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println((n-1)/2+" "+(n-1));
    }
    } 
}
