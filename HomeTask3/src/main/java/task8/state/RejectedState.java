package task8.state;

public class RejectedState implements State {

    private String commission;
    private Grant grant;

    public RejectedState(Grant grant, String commission) {
        this.grant = grant;
        this.commission = commission;
    }

    public void toConsideration(){
    }

    public void reject(String commission){
    }

    public void confirmed(String commission){
    }

    public void recall() {
    }

    @Override
    public void status() {
        System.out.println(String.format("Grand %s was rejected by %s", grant.getGrantDetails(), commission));
    }
}
