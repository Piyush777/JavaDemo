package org.ust.Trees;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(70);
        binaryTree.insert(80);
        binaryTree.insert(10);

        System.out.println("Pre Order");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("Post Order");
        binaryTree.postOrder(binaryTree.root);

        System.out.println("In Order");
        binaryTree.inOrder(binaryTree.root);

        List<List<Integer>> result = binaryTree.levelOrder(binaryTree.root);
        for(List<Integer> level: result){
            System.out.println(level);
        }


    }
}


