package javaapplication118;
import java.util.Scanner;
public class JavaApplication118 {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
              long t=sc.nextLong();
              while(t-->0){
                 long n=sc.nextLong(); 
                 String s=sc.next();
                 if(n>2||s.equals("00")||s.equals("11")){
                     System.out.println("NO");
                 }else{
                     System.out.println("YES");
                 }
           }
}  
}
