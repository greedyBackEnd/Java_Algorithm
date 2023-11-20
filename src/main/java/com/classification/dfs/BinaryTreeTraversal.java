package com.classification.dfs;

import java.util.*;

public class BinaryTreeTraversal {
    public static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }
    public static class Node {
        int data;
        Node lt, rt;
        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }

    public static void DFS(Node root) {
        if (root==null) return;
        else {
//            System.out.print(root.data + " "); // 전위
            DFS(root.lt);
            System.out.print(root.data + " "); // 중위
            DFS(root.rt);
//            System.out.print(root.data + " "); // 후위
        }
    }
}
