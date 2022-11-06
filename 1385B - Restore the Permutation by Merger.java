
package javaapplication102;

import java.util.HashSet;
import java.util.Scanner;

public class JavaApplication102 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
        while(t-->0){
         HashSet<Integer> hs=new HashSet<Integer>();
    int n=sc.nextInt();
    for(int i=0;i<2*n;i++)
    {   
        int k=sc.nextInt();
        if(hs.contains(k))
        continue;
        else
        {
            System.out.print(k+" ");
            hs.add(k);
        }
         }
            System.out.println();
    }
    } 
}
