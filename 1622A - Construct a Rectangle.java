package javaapplication107;
import java.util.Scanner;
public class JavaApplication107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
      long a=sc.nextLong();
      long b=sc.nextLong();
      long c=sc.nextLong();
      boolean r=false;
      if(a == b+c ||b == a+c || c == b+a){
         r=true;
          }
      if(a%2==0&&b==c||b%2==0&&a==c||c%2==0&&a==b){
         r=true;
      }
    if(!r){
        System.out.println("NO");     
        }else{
        System.out.println("YES");
    }
    }
    } 
}
