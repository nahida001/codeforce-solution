package javaapplication109;

import java.util.Scanner;

public class JavaApplication109 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while(t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long c=sc.nextInt();
            long first=0,second=0;
            first=a-1;
            second=Math.abs(b-c)+Math.abs(c-1);
            if(first<second){
                System.out.println("1");
            }else if(first>second){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
        }
   }
