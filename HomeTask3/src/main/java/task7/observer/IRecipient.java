package task7.observer;

import java.util.ArrayList;
import java.util.List;

public interface IRecipient {
    SubscribeType getType();
    void update(PostOffice postOffice);

}
