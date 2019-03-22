package epam.hometask1;

public class Task3 {
    public static void main(String[] args) {
        byte k = 1;

        byte b = 1;
        while ((b<<=1) != 0){
//            System.out.print(b + " -> ");
            k++;
        }
        System.out.println("byte: " + k);

        k = 1;
        short s = 1;
        while ((s<<=1) != 0){
//            System.out.print(s + " -> ");
            k++;
        }
        System.out.println("short: " + k);

        k = 1;
        int i = -1;
        while ((i>>>=1) != 0){
//            System.out.print(i + " -> ");
            k++;
        }
        System.out.println("int: " + k);

        k = 1;
        long l = -1;
        while ((l>>>=1) != 0){
//            System.out.print(l + " -> ");
            k++;
        }
        System.out.println("long: " + k);
    }
}
