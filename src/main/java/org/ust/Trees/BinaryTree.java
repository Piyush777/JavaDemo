package org.ust.Trees;

import java.util.*;

public class BinaryTree {

    TreeNode root;

    public void insert(int value){
        root = insertRec(root,value);
    }

    private TreeNode insertRec(TreeNode root, int value){

        if(Objects.isNull(root)){
            root = new TreeNode(value);
            return root;
        }

        if(value<root.value){
            root.left = insertRec(root.left,value);
        }else if(value> root.value){
            root.right = insertRec(root.right,value);
        }
        return root;
    }

    public void preOrder(TreeNode root){
        if(Objects.nonNull(root)){
            System.out.println(root.value+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(TreeNode root){
        if(Objects.nonNull(root)){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value+" ");
        }
    }

    public void inOrder(TreeNode root){
        if(Objects.nonNull(root)){
            inOrder(root.left);
            System.out.println(root.value+" ");
            inOrder(root.right);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        if(Objects.isNull(root)){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<levelSize;++i){

                TreeNode node = queue.poll();
                currentLevel.add(node.value);

                if(Objects.nonNull(node.left)){
                    queue.offer(node.left);
                }

                if(Objects.nonNull(node.right)){
                    queue.offer(node.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
