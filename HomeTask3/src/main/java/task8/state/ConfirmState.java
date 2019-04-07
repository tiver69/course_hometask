package task8.state;

public class ConfirmState implements State {

    private String commission;
    private Grant grant;

    public ConfirmState(Grant grant, String commission) {
        this.grant = grant;
        this.commission = commission;
    }

    @Override
    public void toConsideration(){
        System.out.println("Grand already confirmed!");
    }

    @Override
    public void reject(String commission){
    }

    @Override
    public void confirmed(String commission){
    }

    @Override
    public void recall() {
    }

    @Override
    public void status() {
        System.out.println(String.format("Grand %s was confirmed by %s", grant.getGrantDetails(), commission));
    }
}