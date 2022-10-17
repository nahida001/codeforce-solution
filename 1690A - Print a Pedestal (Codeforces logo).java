package javaapplication74;
import java.util.Scanner;
public class JavaApplication74 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
       while(t-->0){
           int a=0,b=0,c=0;
           int n=sc.nextInt();
        if(n % 3 == 0){a = b = c = (n - 3) / 3; a += 1; b += 2;}
          else if(n % 3 == 1){a = b = c = (n - 4) / 3; a += 1; b += 3;}
        else if(n % 3 == 2){a = b = c = (n - 5) / 3; a += 2; b += 3;}
           System.out.print(a+" "+b+" "+c);
           System.out.println();
       }
    }
   }


                                                                                                                                                                               
