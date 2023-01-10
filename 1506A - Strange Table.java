package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long  x=sc.nextLong();
            long col=x/n;
            if(x%n!=0)
                col++;
                long row=x%n;
            if(row==0)
                row=n;
            long ans=((row-1)*m)+col;
            System.out.println(ans);
        }
    }
    
}
