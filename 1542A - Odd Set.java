package javaapplication101;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication101 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int a[]=new int[n*2];
    for(int i=0;i<a.length;i++)
    {   
      a[i]=sc.nextInt();   
    }
      System.out.println(solve(a) ? "Yes" : "No");
    
    }
        sc.close();
}
    static boolean solve(int a[]){
        return Arrays.stream(a).filter(x->x%2!=0).count()*2==a.length;  
    }
    
}
