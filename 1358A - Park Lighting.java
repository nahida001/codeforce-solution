package javaapplication98;

import java.util.Scanner;

public class JavaApplication98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        double n=sc.nextInt();
        double m=sc.nextInt();
        int rn=(int)Math.ceil((n*m)/2);
        System.out.println(rn); 
        
      }
    }
    
}
