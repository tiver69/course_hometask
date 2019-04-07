package task8.state;

public class ConsiderState implements State {

    private Grant grant;

    public ConsiderState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void toConsideration(){
        System.out.println("Already in consideration!");
    }

    @Override
    public void reject(String commission){
        grant.setState(new RejectedState(grant, commission));
    }

    @Override
    public void confirmed(String commission){
        grant.setState(new ConfirmState(grant, commission));
    }

    @Override
    public void recall(){
        grant.setState(new RecallState(grant));
    }

    @Override
    public void status() {
        System.out.println(String.format("Grand %s is %s", grant.getGrantDetails(), "in consideration by commission"));
    }

}
