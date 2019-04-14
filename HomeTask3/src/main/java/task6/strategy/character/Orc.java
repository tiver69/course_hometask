package task6.strategy.character;

import task6.strategy.GameCharacter;
import task6.strategy.moveStrategies.Fly;
import task6.strategy.moveStrategies.Walk;

public class Orc extends GameCharacter {

    private String orcCharacteristic = "Orc ";

    public Orc() {
        super(new Walk());
    }

    @Override
    public void startFly(){
        return;
    }

    @Override
    public void startWalk(){
        return;
    }

    @Override
    public void move(){
        System.out.print(orcCharacteristic);
        super.move();
    }
}