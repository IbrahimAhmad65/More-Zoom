package org.core.Dynamics;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.Num;

import java.util.Iterator;

public class Flat<LessDimensions extends Num>{
    public double[] data;
    public int dimensions;
    public Flat(Nat<LessDimensions> dimensionsNat, double... data){
        this.dimensions = dimensionsNat.getNum();;
        this.data = data;
    }

    public double get(int col){
        return this.data[col];
    }

    public int getDimensions() {
        return dimensions;
    }
}
