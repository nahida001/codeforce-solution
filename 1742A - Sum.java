package javaapplication108;
import java.util.Arrays;
import java.util.Scanner;
public class JavaApplication108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           int sum=0;
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
                Arrays.sort(arr);
             sum=arr[0]+arr[1];
            if(sum==arr[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        
        
    }
    }
    
}
