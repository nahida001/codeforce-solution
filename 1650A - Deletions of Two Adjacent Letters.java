package javaapplication86;
import java.util.Scanner;
public class JavaApplication86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
       int r=0;
        String s=sc.next();
        char ch=sc.next().charAt(0);
      for(int i=0;i<s.length();i++){
        if( ch==s.charAt(i)&&i%2==0){
           r=1;
            break;
        }
      }
      if(r==1){
          System.out.println("YES");
      }else{
    System.out.println("NO");
      }
    }
    }
    
}
