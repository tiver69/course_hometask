package task8.state;

public interface State {
    void toConsideration();
    void reject(String commission);
    void confirmed(String commission);
    void recall();
    void status();
}
