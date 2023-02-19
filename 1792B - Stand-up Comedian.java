package javaapplication26;

import java.util.Scanner;

public class JavaApplication26 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long cnt = a;
            long m = Math.min(b, c);
            if (a > 0) {
                cnt += 2 * m;
                b -= m;
                c -= m;
            }
            if (b > 0) {
                long more = Math.min(a, b);
                b -= more;
                a -= more;
                cnt += more;
            } else {
                long more = Math.min(a, c);
                c -= more;
                a -= more;
                cnt += more;
            }
            if (a > 0) {
                long more = Math.min(a, d);
                d -= more;
                a -= more;
                cnt += more;
            }
            if (b > 0 || c > 0 || d > 0) {
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}




