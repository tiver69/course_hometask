package task10.memento;

import java.util.Stack;

public class SaveHistory {
    private Stack<Save> saveHistory = new Stack();

    public void getLastSave(XOGame XOGame) {
        if (saveHistory.size() == 1)
            XOGame.rewrite(saveHistory.peek());
        else
            XOGame.rewrite(saveHistory.pop());
    }

    public void save(Save memento) {
        saveHistory.push(memento);
    }

    public int countStep(){
        return saveHistory.size();
    }
}

