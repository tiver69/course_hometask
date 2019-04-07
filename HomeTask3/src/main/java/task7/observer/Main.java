package task7.observer;

public class Main {
    public static void main(String[] args) {
        PostOffice novaPoshta = new PostOffice();

        Recipient recipient1 = new Recipient("Rec-1", SubscribeType.ALL);
        Recipient recipient2 = new Recipient("Rec-2", SubscribeType.MAGAZINE);
        Recipient recipient3 = new Recipient("Rec-3", SubscribeType.NEWSPAPER);

        novaPoshta.addRecipient(recipient1);
        novaPoshta.addRecipient(recipient2);
        novaPoshta.addRecipient(recipient3);

        novaPoshta.newMagazine("Formula-1 Magazine");
        novaPoshta.newNewspaper("Yakas' Pravda Newspaper");
        novaPoshta.newMagazine("Moda Magazine");

        novaPoshta.printInfo();
    }
}
