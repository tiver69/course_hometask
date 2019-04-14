package task6.strategy;

import task6.strategy.moveStrategies.Fly;

public abstract class GameCharacter {
    private MoveStrategy moveStrategy;

    public GameCharacter(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public abstract void startFly();

    public abstract void startWalk();

    public void move(){
        getMoveStrategy().move();
    }
}
