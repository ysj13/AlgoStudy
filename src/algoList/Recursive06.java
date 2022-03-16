package algoList;

/**
 * 부분집합 구하기 DFS
 */
public class Recursive06 {
    static int n;
    static int[] chk;

    public void DFS(int L) {
        if(L == n+1) {
            String tmp = "";
            for(int i = 1; i <= n; i++) {
                if(chk[i] == 1) {
                    tmp += (i + " ");
                }
            }

            if(tmp.length() > 0) {
                System.out.println(tmp);
            }

        } else {
            chk[L] = 1;    // 사용한다
            DFS(L+1);   // left
            chk[L] = 0;    // 사용하지 않는다
            DFS(L+1);   // right
        }
    }

    public static void main(String[] args) {
        Recursive06 t = new Recursive06();
        n = 3;
        chk = new int[n+1];
        t.DFS(1);
    }
}
