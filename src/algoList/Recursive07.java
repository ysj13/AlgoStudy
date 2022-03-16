package algoList;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 넓이우선탐색 BFS
 */
public class Recursive07 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int length = Q.size();
            System.out.println("L = " + L);
            for (int i = 0; i < length; i++) {
                Node current = Q.poll();
                System.out.println(current.data + " ");

                // 현재노드의 왼쪽자식이 존재한다면
                if(current.lt != null) {
                    Q.offer(current.lt);
                }

                // 현재노드의 오른쪽 자식이 존재한다면
                if(current.rt != null) {
                    Q.offer(current.rt);
                }
            }

            // level 끝
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Recursive07 tree = new Recursive07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
