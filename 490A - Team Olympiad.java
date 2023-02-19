package javaapplication25;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaApplication25 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       List<Integer> v1 = new ArrayList<Integer>();
        List<Integer> v2 = new ArrayList<Integer>();
        List<Integer> v3 = new ArrayList<Integer>();
        int n=sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            int a=sc.nextInt();
            if(a==1){
                v1.add(i);
            }
            else if(a==2){
                v2.add(i);
            }else{
                v3.add(i);
            }
        }
        int mn=Math.min(Math.min(v1.size(), v2.size()),v3.size());
        System.out.println(mn);
        for (int i = 0; i < mn; ++i) {
       
 System.out.println(v1.get(i) + " " + v2.get(i) + " " + v3.get(i));
    }
         sc.close();
    } 
}
