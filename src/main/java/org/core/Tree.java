package org.core;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.Num;

import java.util.ArrayList;

public class Tree<Dimensions extends Num> {
    private int dimensions;
    private ArrayList<Node<Dimensions>> nodes;
    public Tree(Nat<Dimensions> dimensionsNat, Node<Dimensions> root){
        this.dimensions = dimensionsNat.getNum();
        nodes = new ArrayList<>();
        nodes.add(root);
    }

    public void addNode(Node<Dimensions> node){
        nodes.add(node);
    }
    public void dropNode(Node<Dimensions> node){
        nodes.remove(node);
    }
    // TODO figure out how to purge a branch
    public void removeNode(Node<Dimensions> node){

    }

    public int size(){
        return nodes.size();
    }

    public Node<Dimensions> get(int i){
        return nodes.get(i);
    }
}
