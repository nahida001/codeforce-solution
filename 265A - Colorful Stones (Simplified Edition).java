package javaapplication94;
import java.util.Scanner;
public class JavaApplication94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int c=1,k=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==s1.charAt(k)){
                c++;
                k++;
            }
        }
        System.out.println(c);
    }
    
}
