package javaapplication113;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class JavaApplication113 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
              int t=sc.nextInt();
              int sub=0,stu;
              while(t-->0){
                int  c=0;
                  int n=sc.nextInt();
                 Set<Integer> mp = new HashSet<Integer>();
                     for(int i = 0; i < n; i++){
                         mp.add(sc.nextInt());
                     }
                     Set<Integer> mp1 = new HashSet<Integer>();
                     mp1.addAll(mp);
                      int even=0;
                      int odd=0;
                      sub = n - mp1.size();
                       if(sub%2==1){
                          sub++;
                              }
                  System.out.println(n-sub);
              }
    }
    
}
