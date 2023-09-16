package games.baghchal;

import core.AbstractGameState;
import core.AbstractParameters;
import core.components.Component;
import games.GameType;

import java.util.List;

public class BaghChalGameState extends AbstractGameState {
    /**
     * @param gameParameters - game parameters.
     * @param nPlayers
     */
    public BaghChalGameState(AbstractParameters gameParameters, int nPlayers) {
        super(gameParameters, nPlayers);
    }

    @Override
    protected GameType _getGameType() {
        return null;
    }

    @Override
    protected List<Component> _getAllComponents() {
        return null;
    }

    @Override
    protected AbstractGameState _copy(int playerId) {
        return null;
    }

    @Override
    protected double _getHeuristicScore(int playerId) {
        return 0;
    }

    @Override
    public double getGameScore(int playerId) {
        return 0;
    }

    @Override
    protected boolean _equals(Object o) {
        return false;
    }
}
