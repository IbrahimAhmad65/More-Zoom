package org.core.Dynamics;

import edu.wpi.first.math.Num;

public abstract class Constraint<Dimensions extends Num> {
    public abstract boolean hasViolated(State<Dimensions> currentState);

}
