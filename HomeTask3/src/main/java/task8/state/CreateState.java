package task8.state;

public class CreateState implements State {
    private Grant grant;

    public CreateState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void toConsideration(){
        grant.setState(new ConsiderState(grant));
    }

    @Override
    public void reject(String commission){
    }

    @Override
    public void confirmed(String commission){
    }

    @Override
    public void recall(){
    }

    @Override
    public void status() {
        System.out.println(String.format("Grand %s is %s", grant.getGrantDetails(), "in creation"));
    }
}
