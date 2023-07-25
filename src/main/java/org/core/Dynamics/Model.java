package org.core.Dynamics;

import edu.wpi.first.math.Num;

import java.util.List;

public abstract class Model<Dimensions extends Num, LessDimensions extends Num> {
    protected Dynamics<Dimensions,LessDimensions> dynamics;
    public abstract List<State<Dimensions>> findTrajectory(State<Dimensions> state, Flat<LessDimensions> flat);
    protected abstract State<Dimensions> step(double dt, State<Dimensions> state, Flat<LessDimensions> flat);
}
