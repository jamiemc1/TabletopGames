package games.baghchal;

import core.AbstractParameters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGameParameters {

    BaghChalForwardModel fm = new BaghChalForwardModel();
    BaghChalGameParameters parameters = new BaghChalGameParameters(5, 5);
    BaghChalGameState state = new BaghChalGameState(parameters, 2);


    @Before
    public void setup() {
        fm.setup(state);
    }

    @Test
    public void testCopy() {
        BaghChalGameParameters testCopy = (BaghChalGameParameters) parameters._copy();

        assertEquals(testCopy.gridHeight, 5);

    }

}
