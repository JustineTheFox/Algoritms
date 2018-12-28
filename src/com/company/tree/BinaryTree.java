package com.company.tree;

public class BinaryTree {

    Node root;

    void add(int val){

        Node nodeToInsert = new Node();
        nodeToInsert.value=val;

        if (root == null) {
            root = nodeToInsert;
           // root.value = val;
        } else {
            Node current = root;
            while (true){
                if(val < root.value) {
                    if (current.left == null) {
                        current.left = nodeToInsert; //dowiązanie
                        break;
                    } else {
                        current = current.left;
                    }
                }  else {
                    if(current.right ==null){
                        current.right = nodeToInsert;
                        break; } else{
                        current = current.right;
                    }
                }
            }
        }
    }
}
