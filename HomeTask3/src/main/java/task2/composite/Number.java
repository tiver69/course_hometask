package task2.composite;

public class Number implements MyMath {
    int current;

    public Number(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public int count() {
        return current;
    }

    @Override
    public String toString(){
        return Integer.toString(current) ;
    }
}
