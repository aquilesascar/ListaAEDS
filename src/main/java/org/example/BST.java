package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public int findMinIterative() {
        if (root == null) {
            throw new IllegalStateException("A árvore está vazia");
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.key;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        preorderRec(root);
        System.out.println();
    }
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
        System.out.println();
    }
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            //nó com apenas um filho ou nenhum filho
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            //nó com dois filhos: pega o sucessor in-order (menor na subárvore direita)
            root.key = minValue(root.right);

            //deleta o sucessor in-order
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public int calculateHeightIterative() {
        if (root == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = -1;

        while (true) {
            int nodeCount = queue.size();
            if (nodeCount == 0) {
                return height;
            }
            height++;

            while (nodeCount > 0) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                nodeCount--;
            }
        }
    }

    public List<List<Integer>> findPathsToLeaves() {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPathsRec(root, currentPath, allPaths);
        return allPaths;
    }

    private void findPathsRec(Node node, List<Integer> currentPath, List<List<Integer>> allPaths) {
        if (node == null) {
            return;
        }

        currentPath.add(node.key);

        if (node.left == null && node.right == null) {
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            findPathsRec(node.left, currentPath, allPaths);
            findPathsRec(node.right, currentPath, allPaths);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public int countNodesAtOddLevels() {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        int count = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            if (level % 2 != 0) {
                count += levelSize;
            }

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            level++;
        }
        return count;
    }

    public int countEvenKeyNodes() {
        return countEvenKeyNodesRec(root);
    }

    private int countEvenKeyNodesRec(Node node) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        if (node.key % 2 == 0) {
            count = 1;
        }

        return count + countEvenKeyNodesRec(node.left) + countEvenKeyNodesRec(node.right);
    }
}
