package algoList;

public class Recursive03 {
    public static void main(String[] args) {
        Recursive03 recursive03 = new Recursive03();
        System.out.println(recursive03.DFS(5));
    }

    public int DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }
}
