package task6.strategy.character;

import task6.strategy.GameCharacter;
import task6.strategy.MoveStrategy;
import task6.strategy.moveStrategies.Fly;
import task6.strategy.moveStrategies.Walk;

public class Elf extends GameCharacter {

    private String elfCharacteristic = "Elf ";
    private boolean magic;

    public Elf(boolean magic) {
        super(new Walk());
        this.magic = magic;
        if (magic) elfCharacteristic += "- magician ";
    }

    @Override
    public void startFly(){
        if (magic && getMoveStrategy() instanceof Walk)
            setMoveStrategy(new Fly());
    }

    @Override
    public void startWalk(){
        if (getMoveStrategy() instanceof Fly)
            setMoveStrategy(new Walk());
    }

    @Override
    public void move(){
        System.out.print(elfCharacteristic);
        super.move();
    }
}
