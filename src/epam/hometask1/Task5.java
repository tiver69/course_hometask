package epam.hometask1;

public class Task5 {
    public static void main(String[] args) {
        int pos = 1;
        int ch = 234;
        System.out.println(ch + " = " + Long.toBinaryString(ch));
        int posCh = 1;
        for (int i = 0; i < pos; i++)
            posCh <<= 1;
        //на ноль
        System.out.println((ch&(~posCh)) + " = " + Long.toBinaryString(ch&(~posCh)) +
                " - to zero");
        //на единицу
        System.out.println((ch|posCh) + " = " + Long.toBinaryString(ch|posCh) +
                " - to one");
    }
}
