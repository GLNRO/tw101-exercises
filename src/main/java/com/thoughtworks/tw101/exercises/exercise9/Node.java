package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;
// If a node has a left node, check left node
//      If left node has a left node check
//          If child of left node has a left node check
//          If child of let node has a right node check
//          Else, if there are no children, return name
//      If left node has a right node check

public class Node {
    public String name;
    private Node leftChild;
    private Node rightChild;
    private List<String> alphaList = new ArrayList<String>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(this.name) <= 0 ){
            if (leftChild == null) {
                leftChild = new Node(nameOfNewNode);
            }
            else{
                leftChild.add(nameOfNewNode);
            }
        }
        else if(nameOfNewNode.compareTo(this.name) > 0){
            if (rightChild == null){
                rightChild = new Node(nameOfNewNode);
            }
            else{
                rightChild.add(nameOfNewNode);
            }
        }

    }

    public List<String> names() {
//
        //if no children, add node
        if(leftChild == null && rightChild == null){
            alphaList.add(name);
        }
        //if children
        else{
            //if left child exists
            if(leftChild != null){
                //call names on left child and push to array
                alphaList.addAll(leftChild.names());
            }
            //add root
            alphaList.add(name);
            if(rightChild != null){
                alphaList.addAll(rightChild.names());
            }
        }
        return alphaList;
    }
}
