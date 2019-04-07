package task7.observer;

import java.util.ArrayList;
import java.util.List;

public class Recipient implements IRecipient{

    private String name;
    private SubscribeType type;

    private List<String> wastepaper = new ArrayList<>();

    public Recipient(String name, SubscribeType type) {
        this.name = name;
        this.type = type;
    }

    public SubscribeType getType() {
        return type;
    }

    public void update(PostOffice postOffice){
        switch (postOffice.getLatest()){
            case MAGAZINE:
                wastepaper.add(postOffice.getMagazine());
                break;
            case NEWSPAPER:
                wastepaper.add(postOffice.getNewspaper());
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return String.format("%s(%s) has: ", name, type.toString()) + wastepaper.toString();
    }
}
