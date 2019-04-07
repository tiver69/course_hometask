package task10.memento;

import javafx.beans.binding.When;

public class XOGame {

    private int[][] xo = new int[3][3];
    private int step, stepI, stepJ;
    private int randomI, randomY;
    private SaveHistory saveHistory = new SaveHistory();

    public XOGame() {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++)
                xo[i][j] = -1;
        }
    }

    public String setStep(int step) {
        if (!validStep(step)) return "";

        xo[stepI][stepJ] = 1;
        save();
        if (endGame().equals("")) return autoStep();
        else return endGame();
    }

    private String autoStep(){
        randomStep();
        while (xo[randomI-1][randomY-1] != -1){
            randomStep();
        }
        xo[randomI-1][randomY-1] = 0;
        this.step = randomI*10+randomY;
        save();
        print();
        if (endGame().equals("")) return "";
        else return endGame();
    }

    public void save() {
        saveHistory.save(new Save(step));
    }

    public void undo() {
        saveHistory.getLastSave(this);
        saveHistory.getLastSave(this);
        print();
    }

    public void rewrite(Save memento) {
        xo[memento.getStepI()][memento.getStepJ()] = -1;
    }

    private void randomStep(){
        randomI = (int)(Math.random()*3+1);
        randomY = (int)(Math.random()*3+1);
    }

    private boolean validStep(int step){
        int stepI = (step-(step%10))/10-1;
        int stepJ = step%10-1;

        if (xo[stepI][stepJ] == -1){
            this.stepI = stepI;
            this.stepJ = stepJ;
            this.step = step;
            return true;
        }
        return false;
    }

    private String endGame(){
        int xWin = 0;
        int oWin = 0;

        for (int i = 0; i <= 2; i++){
            xWin = 0; oWin=0;
            for (int j = 0; j <= 2; j++) {
                if (xo[i][j] == 0) oWin++;
                if (xo[i][j] == 1) xWin++;
            }
            if (oWin == 3) return "O WINS!";
            if (xWin == 3) return "X WINS!";
        }

        for (int j = 0; j <= 2; j++){
            xWin = 0; oWin=0;
            for (int i = 0; i <= 2; i++) {
                if (xo[i][j] == 0) oWin++;
                if (xo[i][j] == 1) xWin++;
            }
            if (oWin == 3) return "O WINS!";
            if (xWin == 3) return "X WINS!";
        }

        xWin = 0; oWin=0;
        for (int i=0; i<=2; i++){
            if (xo[i][i] == 0) oWin++;
            if (xo[i][i] == 1) xWin++;
        }
        if (oWin == 3) return "O WINS!";
        if (xWin == 3) return "X WINS!";

        xWin = 0; oWin=0;
        for (int i = 0; i <= 2; i++){
            xWin = 0;
            for (int j = 0; j <= 2; j++) {
                if (i+j==3 && xo[i][j] == 0) oWin++;
                if (i+j==3 && xo[i][j] == 1) xWin++;
            }
        }
        if (oWin == 3) return "O WINS!";
        if (xWin == 3) return "X WINS!";

        if (saveHistory.countStep() == 9) return "NO ONE WINS!";
        return "";
    }

    public void print(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++) {
                if (xo[i][j] == 0) System.out.print("|_O_|");
                if (xo[i][j] == 1) System.out.print("|_X_|");
                if (xo[i][j] == -1) System.out.print("|___|");
            }
            System.out.println();
        }
        System.out.println();
    }
}
