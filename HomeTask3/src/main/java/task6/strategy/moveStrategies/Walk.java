package task6.strategy.moveStrategies;

import task6.strategy.MoveStrategy;

public class Walk implements MoveStrategy {
    public void move() {
        System.out.println("walks on food");
    }
}
