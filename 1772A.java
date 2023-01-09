
package javaapplication149;

import java.util.Scanner;
public class JavaApplication149 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while(t-->0){
       String s=sc.next();
    char ch[]=s.toCharArray();
            System.out.println(ch[0]-'0'+ch[2]-'0');   
     
    }
    } 
}
