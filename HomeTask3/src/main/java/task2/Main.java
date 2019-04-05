package task2;

public class Main {
    public static void main(String[] args) {
        Sum result = new Sum(
                new Composition(new Sum(new Number(1), new Number(2)),new Number(4)),
                new Composition(new Number(5), new Sum(new Number(3), new Number(6)))
        );
        System.out.println(result + " = " + result.result());
    }
}
