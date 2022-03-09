package algoList;

import com.sun.tools.javac.Main;

public class Recursive01 {
    public static void main(String[] args) {
        Recursive01 t = new Recursive01();
        t.DFS(3);
    }

    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            System.out.println("n = " + n);
            DFS(n-1);
        }
    }
}
