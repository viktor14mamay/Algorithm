package hackerrank.practice.datastructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }

        if (root.left == null && root.right == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static Node lca(Node root, int v1, int v2) {
        if (root.data > v1 && root.data > v2) return lca(root.left, v1, v2);
        else if (root.data < v1 && root.data < v2) return lca(root.right, v1, v2);
        return root;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    private static void topView(Node root) {
        class QueueObj {
            private Node node;
            private int horizontalDistance;

            private QueueObj(Node node, int hd) {
                this.node = node;
                this.horizontalDistance = hd;
            }
        }

        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();

        if (root == null) {
            return;
        } else {
            q.add(new QueueObj(root, 0));
        }

        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.horizontalDistance)) {
                topViewMap.put(tmpNode.horizontalDistance, tmpNode.node);
            }

            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left, tmpNode.horizontalDistance - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right, tmpNode.horizontalDistance + 1));
            }

        }
        for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    public static void levelOrder(Node root) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            Node node = deque.pollFirst();
            System.out.println(node.data);
            if (node.left != null) {
                deque.addLast(node.left);
            }

            if (node.right != null) {
                deque.addLast(node.right);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}