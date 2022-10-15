package javaapplication83;
import java.util.Scanner;
public class JavaApplication83 {
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long res=0;
	    int t=sc.nextInt();
	    while(t-->0){
                long n=sc.nextLong();
	        if(n>=(long)Math.pow(10, 0)&&n<(long)Math.pow(10, 1)){ 	            
                res=n-(long)Math.pow(10, 0);
                  System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 1)&& n<(long)Math.pow(10, 2)){
                    res=n-(long)Math.pow(10, 1);
                    System.out.println(res);
                }
                 else if(n>=(long)Math.pow(10, 2)&& n<(long)Math.pow(10, 3)){
                    res=n-(long)Math.pow(10, 2);
                    System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 3)&& n<(long)Math.pow(10, 4)){
                    res=n-(long)Math.pow(10, 3);
                    System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 4)&& n<(long)Math.pow(10, 5)){
                    res=n-(long)Math.pow(10, 4);
                    System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 5)&& n<(long)Math.pow(10, 6)){
                    res=n-(long)Math.pow(10, 5);
                    System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 6)&& n<(long)Math.pow(10, 7)){
                    res=n-(long)Math.pow(10, 6);
                    System.out.println(res);
                }
                else if(n>=(long)Math.pow(10, 7)&& n<(long)Math.pow(10, 8)){
                    res=n-(long)Math.pow(10, 7);
                    System.out.println(res);
                }
               else if(n>=(long)Math.pow(10, 8)&& n<(long)Math.pow(10, 9)){
                    res=n-(long)Math.pow(10, 8);
                    System.out.println(res);
                }
                 
               else if(n>=(long)Math.pow(10, 9)&& n<(long)Math.pow(10, 10)){
                    res=n-(long)Math.pow(10, 9);
                    System.out.println(res);
                }
          }
    }
    
}
 