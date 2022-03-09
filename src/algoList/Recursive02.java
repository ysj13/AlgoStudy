package algoList;

public class Recursive02 {
    public static void main(String[] args) {
        Recursive02 recursive02 = new Recursive02();
        recursive02.DFS(11);
    }

    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.println(n%2 + " ");
        }
    }
}
