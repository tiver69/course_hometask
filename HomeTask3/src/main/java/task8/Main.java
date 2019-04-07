package task8;

import task8.state.Grant;

public class Main {

    public static void main(String[] args) {
        Grant grant = new Grant("Grant#1");
        grant.getStatus();

        grant.apply();
        grant.getStatus();

        grant.confirm("commission#1");
        grant.getStatus();

        grant.recall();
        grant.getStatus();
    }
}
