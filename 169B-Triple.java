package javaapplication76;

import java.util.HashMap;
import java.util.Scanner;
public class JavaApplication76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
  while(t-- >0) {
   int n=sc.nextInt();
   HashMap<Integer,Integer> fmap=new HashMap<>();
   int ans=-1;
   for(int i=0;i<n;i++) {
    int v=sc.nextInt();
    fmap.put(v,fmap.getOrDefault(v,0)+1);
    if(fmap.get(v)==3) {
     ans=v;
    }
   }
   System.out.println(ans);
  }
       }
    }
    
    

