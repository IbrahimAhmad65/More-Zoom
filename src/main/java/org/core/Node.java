package org.core;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.Num;
import org.core.Dynamics.State;

import java.util.ArrayList;
import java.util.List;

public class Node<Dimension extends Num> {
    private State<Dimension> state;
    private int dimensionSize;
    private double cost = Double.POSITIVE_INFINITY;
    private List<State<Dimension>> trajectoryToParent = new ArrayList<>();
    public Node<Dimension> parent = null;
    public Node(Nat<Dimension> dimensions, double... data){
        this.state = new State<>(dimensions,data);
        this.dimensionSize = dimensions.getNum();
    }
    public Node(Nat<Dimension> dimensions, State<Dimension> s){
        this.state = s;
        this.dimensionSize = dimensions.getNum();
    }
    public double get(int position){
        return state.getData(position);
    }

    public State<Dimension> getState() {
        return state;
    }
    public void addStateToTrajectory(State<Dimension> state){
        trajectoryToParent.add(0,state);
    }
}
