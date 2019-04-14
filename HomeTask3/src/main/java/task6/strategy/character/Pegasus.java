package task6.strategy.character;

import task6.strategy.GameCharacter;
import task6.strategy.moveStrategies.Fly;
import task6.strategy.moveStrategies.Walk;

public class Pegasus extends GameCharacter {

    private String pegasusCharacteristic = "Pegasus ";

    public Pegasus() {
        super(new Walk());
    }

    @Override
    public void startFly(){
        if (getMoveStrategy() instanceof Walk)
            setMoveStrategy(new Fly());
    }

    @Override
    public void startWalk(){
        if (getMoveStrategy() instanceof Fly)
            setMoveStrategy(new Walk());
    }

    @Override
    public void move(){
        System.out.print(pegasusCharacteristic);
        super.move();
    }
}
