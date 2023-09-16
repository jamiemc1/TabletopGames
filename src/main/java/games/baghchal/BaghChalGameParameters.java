package games.baghchal;

import core.AbstractParameters;

public class BaghChalGameParameters extends AbstractParameters{
    int gridWidth = 5;
    int gridHeight = 5;

    public BaghChalGameParameters(long seed) {
        super(seed);
    }

    @Override
    protected AbstractParameters _copy() {
        BaghChalGameParameters copy = new BaghChalGameParameters(System.currentTimeMillis());
        copy.gridWidth = gridWidth;
        copy.gridHeight = gridHeight;

        return copy;
    }

    @Override
    protected boolean _equals(Object o) {
        return false;
    }
}
