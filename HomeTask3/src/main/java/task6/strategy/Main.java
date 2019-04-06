package task6.strategy;

import task6.strategy.character.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<GameCharacter> game = new ArrayList<GameCharacter>();
        game.add(new Pegasus());
        game.add(new Elf(true));
        game.add(new Elf(false));
        game.add(new Orc());

        for (GameCharacter character: game) {
            character.move();
        }
        System.out.println("\nThey have reached wide river:");

        for (GameCharacter character: game) {
            character.startFly();
            character.move();
        }

    }
}
