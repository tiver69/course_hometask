package task8.state;

public class Grant {

    private State state;
    private String grantDetails;

    public Grant(String grantDetails) {
        this.grantDetails = grantDetails;
        state = new CreateState(this);
    }

    public String getGrantDetails() {
        return grantDetails;
    }

    public void getStatus() {
        state.status();
    }

    public void apply(){
        state.toConsideration();
    }

    public void recall(){
        state.recall();
    }

    public void reject(String commissionId){
        state.reject(commissionId);
    }

    public void confirm(String commissionId){
        state.confirmed(commissionId);
    }

    protected void setState(State state) {
        this.state = state;
    }
}