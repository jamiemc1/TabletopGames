package games.baghchal;

import core.AbstractForwardModel;
import core.AbstractGameState;
import core.actions.AbstractAction;

import java.util.List;

public class BaghChalForwardModel extends AbstractForwardModel {
    @Override
    protected void _setup(AbstractGameState firstState) {

    }

    @Override
    protected void _next(AbstractGameState currentState, AbstractAction action) {

    }

    @Override
    protected List<AbstractAction> _computeAvailableActions(AbstractGameState gameState) {
        return null;
    }

    @Override
    protected AbstractForwardModel _copy() {
        return null;
    }

    @Override
    protected void endPlayerTurn(AbstractGameState state) {

    }
}
