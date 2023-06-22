package com.dataStructure.tree;

public class BinarySearchTree {

    private static class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    //  삽입 메서드
    public void insert(int key) {
        root = insertNode(root, key);
    }

    // 삽입 메서드에서 재귀호출할 메서드
    public Node insertNode(Node node, int key) {
        // node가 Null -> 부모 노드의 자식 노드가 Null
        // 여기에 삽입한다.
        if (node == null) {
            node = new Node(key);
            return node;
        }

        if (node.key == key) {
            // 탐색에 성공한 경우, 더 확인하지 않음
            return node;
        }

        // 현재 노드보다 데이터가 작을 경우 왼쪽 트리로 이동 (재귀호출)
        if (key < node.key) {
            node.left = insertNode(node.left, key);
        }
        // 현재 노드보다 데이터가 클 경우 오른쪽 트리로 이동 (재귀호출)
        else if (key > node.key) {
            node.right = insertNode(node.right, key);
        }

        // 삽입이 일어나지 않았을 경우, 본래의 자식을 그대로 반환
        return node;
    }

    // 탐색 메서드
    public boolean search(int key) {
        return searchNode(root, key);
    }

    // 탐색 재귀함수
    private boolean searchNode(Node node, int key) {
        // 현재 노드가 null인 경우
        if (node == null) {
            return false;
        }

        // 탐색 성공
        if (key == node.key) {
            return true;
        }

        // 재귀호출
        // 현재 노드보다 데이터가 더 작을 경우
        if (key < node.key) {
            // 왼쪽 서브트리 탐색 결과 반환
            return searchNode(node.left, key);
        }
        // 현재 노드보다 데이터가 더 클 경우
        else {
            // 오른쪽 서브트리 탐색 결과 반환
            return searchNode(node.right, key);
        }
    }

    // 중위 순회
    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.key + " ");
            inorder(node.right);
        }
    }

    // 삭제 메서드
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    // 삭제 재귀함수
    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {
            // Case 1: 리프 노드
            if (node.left == null && node.right == null) {
                node = null;
            }
            // Case 2: 한 개의 자식 노드를 가진 노드
            else if (node.right == null) {
                node = node.left;
            } else if (node.left == null) {
                node = node.right;
            }
            // Case 3: 두 개의 자식 노드를 가진 노드
            else {
                Node temp = minValueNode(node.right); // in-order successor
                node.key = temp.key;
                node.right = deleteNode(node.right, temp.key);
            }
        }

        return node;
    }

    // 오른쪽 서브트리에서 가장 작은 노드 찾기 (in-order successor)
    private Node minValueNode(Node node) {
        Node current = node;

        // 가장 왼쪽 리프 노드 찾기
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }


    public static void main(String[] args) {
        int[] data = {50, 30, 70, 20, 40, 60, 80};
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i < data.length; i++) {
            bst.insert(data[i]);
        }

        System.out.println("중위순회");
        bst.inorderTraversal();
        System.out.println();

        System.out.println(bst.search(40));
        System.out.println(bst.search(55));
        System.out.println(bst.search(80));
    }
}
