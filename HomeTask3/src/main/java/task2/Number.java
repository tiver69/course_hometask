package task2;

public class Number implements Math{
    int current;

    public Number(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public int result() {
        return current;
    }

    @Override
    public String toString(){
        return Integer.toString(current) ;
    }
}
