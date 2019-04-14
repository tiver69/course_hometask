package task8.state;

public class RecallState implements State {

    private Grant grant;

    public RecallState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void toConsideration(){
    }

    @Override
    public void reject(String  commission){
    }

    @Override
    public void confirmed(String commission){
    }

    @Override
    public void recall(){
    }

    @Override
    public void status() {
        System.out.println(String.format("Grand %s was %s", grant.getGrantDetails(), "recalled by creator."));
    }
}