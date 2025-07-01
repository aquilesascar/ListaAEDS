package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 3");
        BST tree = new BST();
        int[] keys = {7, 8, 4, 3, 2, 1, 6, 5};
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println("Árvore após inserções:");
        System.out.print("In-order: ");
        tree.inorder();
        System.out.print("Pre-order: ");
        tree.preorder();
        System.out.print("Post-order: ");
        tree.postorder();

        //c)Remova 7 e 6
        System.out.println("\nRemovendo 7 (a raiz)...");
        tree.delete(7);
        System.out.println("Removendo 6...");
        tree.delete(6);

        System.out.println("\nÁrvore final:");
        System.out.print("In-order: ");
        tree.inorder();
    }
}
