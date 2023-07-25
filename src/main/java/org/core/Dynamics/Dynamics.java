package org.core.Dynamics;

import edu.wpi.first.math.Num;

public abstract class Dynamics<Dimensions extends Num, InputDimensions extends Num> {
//    protected Constraint<Dimensions> mainConstraint;
    protected abstract State<Dimensions> stateFromInput(double dt, State<Dimensions> starting, Input<InputDimensions> input);
}
