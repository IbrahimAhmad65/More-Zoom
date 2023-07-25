package org.core.Dynamics;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.Num;

public class State<Dimension extends Num> {
    private int dimension;
    private double[] data;
    public State(Nat<Dimension> dimensionNat, double... data ){
        this.dimension = dimensionNat.getNum();
        this.data = data;
    }

    public double getData(int col){
        return  data[col];
    }
}
