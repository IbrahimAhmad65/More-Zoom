package org.core.Dynamics;

import edu.wpi.first.math.Num;

public abstract class InputConstraint<Dimensions extends Num> {
    public abstract boolean hasViolated(Input<Dimensions> input);
}
