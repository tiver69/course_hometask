package task7.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOffice {

    Map<SubscribeType,List<IRecipient>> recipients = new HashMap<>();
    private String newspaper;
    private String magazine;
    private SubscribeType latest;

    public PostOffice() {
        for (int i = 0; i < SubscribeType.values().length; i++){
            this.recipients.put(SubscribeType.values()[i],new ArrayList<>());
        }
    }

    public String getNewspaper() {
        return newspaper;
    }

    public String getMagazine() {
        return magazine;
    }

    public SubscribeType getLatest() {
        return latest;
    }

    public void addRecipient(IRecipient newRecipient){
        recipients.get(newRecipient.getType()).add(newRecipient);
    }

    public void removeRecipient (Recipient removeRecipient){
        recipients.get(removeRecipient.getType()).remove(removeRecipient);
    }

    public void newNewspaper(String newNewspaper){
        this.newspaper = newNewspaper;
        latest = SubscribeType.NEWSPAPER;
        notifySubscribers();
    }

    public void newMagazine (String newMagazine) {
        this.magazine = newMagazine;
        latest = SubscribeType.MAGAZINE;
        notifySubscribers();
    }

    private void notifySubscribers(){
        for (IRecipient recipient:recipients.get(latest)){
            recipient.update(this);
        }
        for (IRecipient recipient:recipients.get(SubscribeType.ALL)){
            recipient.update(this);
        }
    }

    public void  printInfo(){
        for (int i = 0; i < SubscribeType.values().length; i++){
            for (IRecipient recipient:recipients.get(SubscribeType.values()[i])){
                System.out.println(recipient);
            }
        }

    }
}
