package task2;

import task2.composite.*;
import task2.composite.Number;

import java.util.Stack;

public class Parser {

    private String toParse, toParseSpace;

    public Parser(String toParse){
        this.toParse = toParse.replaceAll(" ", "");
    }

    public MyMath parse(){
        setToParseSpace();
        Stack<MyMath> Q = new Stack();
        Stack<String> W = new Stack();

        for (String node : toParseSpace.split(" ")) {
            // если разделитель
            if (isSeparator(node.charAt(0))){
                // если стек пустой или это ( добавить node в стек
                if (W.empty() || node.equals("(")) W.push(node);
                else
                    // если это ) выполнить все действия до (
                    if (node.equals(")")) {
                        while (!W.peek().equals("(")){
                            MyMath temp = null;
                            MyMath right = Q.pop();
                            MyMath left = Q.pop();
                            switch (W.pop()){
                                case "-" :
                                    temp = new Difference(left, right);
                                    break;
                                case "*" :
                                    temp = new Composition(left, right);
                                    break;
                                case "+" :
                                    temp = new Sum(left, right);
                                    break;
                                case "/" :
                                    temp = new Divide(left, right);
                                    break;
                            }
                            Q.push(temp);
                        }
                        W.pop();
                    }
                    else
                        // если приоритет выше, добавить node в стек
                        if (toStack(W.peek(), node)) {
                            W.push(node);
                        }
                        // если приоритет ниже, выполнить последнее действие
                        // и добавить node в стек
                        else {
                            MyMath temp = null;
                            MyMath right = Q.pop();
                            MyMath left = Q.pop();
                            switch (W.pop()){
                                case "-" :
                                    temp = new Difference(left, right);
                                    break;
                                case "*" :
                                    temp = new Composition(left, right);
                                    break;
                                case "+" :
                                    temp = new Sum(left, right);
                                    break;
                                case "/" :
                                    temp = new Divide(left, right);
                                    break;
                            }
                            Q.push(temp);
                            W.push(node);
                        }
            }
            // если число добавить в стек чисел
            else{
                Q.push(new Number(Integer.parseInt(node)));
            }
//            System.out.println("Q(" + Q.size() + "): " + Q);
//            System.out.println("W(" + W.size() + "): " + W);
//            System.out.println(node + isSeparator(node.charAt(0)));
        }
        while (!W.empty()){
            MyMath temp = null;
            MyMath right = Q.pop();
            MyMath left = Q.pop();
            switch (W.pop()){
                case "-" :
                    temp = new Difference(left, right);
                    break;
                case "*" :
                    temp = new Composition(left, right);
                    break;
                case "+" :
                    temp = new Sum(left, right);
                    break;
                case "/" :
                    temp = new Divide(left, right);
                    break;
            }
            Q.push(temp);
        }
        return Q.pop();
    }

    private void setToParseSpace(){
        int firstParentheses = toParse.charAt(0) == '('? 1 : 0;
        if (toParse.split("\\(").length != toParse.split("\\)").length+firstParentheses)
            throw new IllegalArgumentException("Incorrect number of parentheses.");
        toParseSpace = "";

        char[] charArray = toParse.toCharArray();
        for(int i = 0; i < charArray.length - 1; i++) {
            toParseSpace = toParseSpace + charArray[i];
            if (isSeparator(charArray[i+1]) || isSeparator(charArray[i])) toParseSpace = toParseSpace + " ";
        }
        toParseSpace = toParseSpace + charArray[charArray.length-1];
    }

    private boolean isSeparator(char val){
        String separators = "+-*/()";
        return (separators.lastIndexOf(val) != -1);
    }

    private boolean toStack(String fromStack, String fromParse){
        String priority1 = "+-";
        String priority2 = "*/";

        if ((priority1.lastIndexOf(fromStack) != -1)
                && (priority1.lastIndexOf(fromParse) != -1))
            return false;
        if ((priority2.lastIndexOf(fromStack) != -1)
                && (priority2.lastIndexOf(fromParse) != -1))
            return false;
        if ((priority2.lastIndexOf(fromStack) != -1)
                && (priority1.lastIndexOf(fromParse) != -1))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return (toParse + " = " + parse().count());
    }
}
