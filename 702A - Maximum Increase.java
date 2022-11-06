package javaapplication99;

import java.util.Scanner;

public class JavaApplication99 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n, p, c;
 n=sc.nextInt();
    int cLength = 0;
    int mLength = 0;
    p=sc.nextInt();
    for (int i = 1; i < n; i++) {
        c=sc.nextInt();
        if (p < c) {
            cLength++;
        mLength = Math.max(cLength, mLength);
        }
        else {
            cLength = 0;
        }
        p = c;
    }
        System.out.println(mLength+1); 
    }
    
}
