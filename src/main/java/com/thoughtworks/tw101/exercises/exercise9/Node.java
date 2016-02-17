package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

// If a new node comes before

public class Node {
    public String name;
    private Node leftChild;
    private Node rightChild;

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
        return null;
    }
}
