package javaapplication92;
import java.util.Scanner;
public class JavaApplication92 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           if(n%2==1){
               System.out.println(-1);
           }else{
               for(int i=0;i<n;i++){
               if(i%2==0){
                   System.out.print(i+2+" ");
               }else{
               System.out.print(i+" ");
               } 
               }
           }
    }
    
}
