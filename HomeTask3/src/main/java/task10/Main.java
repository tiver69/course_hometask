package task10;

import task10.memento.XOGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        XOGame game = new XOGame();

        String response = "";
        int cmd = 1;
        System.out.print("step: ");
        Scanner in = new Scanner(System.in);

        while ((cmd = in.nextInt()) != 0) {
            if (cmd == 17) {
                game.undo();
                System.out.print("step: ");
                continue;
            }
            if (!(response = game.setStep(cmd)).equals("")) break;
            System.out.print("step: ");
        }

        game.print();
        System.out.println(response);
    }
}
