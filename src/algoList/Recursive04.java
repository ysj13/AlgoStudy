package algoList;

import java.util.Arrays;

/**
 * 피보나치 수
 */
public class Recursive04 {
    static int fibo[];
    public static void main(String[] args) {
        Recursive04 recursive04 = new Recursive04();

        int n = 5;
        fibo = new int[n + 1];
        recursive04.DFS(n);
        //System.out.println(recursive04.DFS(4));

        for(int i = 1; i <= n; i++) {
            //System.out.print(recursive04.DFS(i) + " ");
            System.out.print(fibo[i] + " ");
        }
    }

    // n번째 수 출력
    public int DFS(int n) {
        if(fibo[n] > 0) {
            return fibo[n];
        }

        if(n == 1) {
            return fibo[n] = 1;
        } else if(n == 2) {
            return fibo[n] = 1;
        } else {
            //return  DFS(n - 2) + DFS(n - 1);
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
}
