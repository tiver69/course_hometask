package task2;

import task2.composite.Composition;
import task2.composite.MyMath;
import task2.composite.Number;
import task2.composite.Sum;

public class MainComposite {
    public static void main(String[] args) {
        Sum result = new Sum(
                new Composition(new Sum(new Number(1), new Number(2)),new Number(4)),
                new Composition(new Number(5), new Sum(new Number(3), new Number(6)))
        );
        System.out.println(result + " = " + result.count());


        String test = "(1+2)*4+5*(3+6)";
        Parser testParser = new Parser(test);

        System.out.println(testParser);


    }
}
