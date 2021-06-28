import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> _equation = new ArrayList<String>();

        _equation.add("5");
        _equation.add("+");
        _equation.add("4");

        for (var _item : _equation) {
            switch (_item) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                    System.out.println("Number " + _item);
                    break;
                case "+":
                    System.out.println("Addition " + _item);
                    break;
                case "-":
                    System.out.println("Substraction " + _item);
                    break;
                case "*":
                    System.out.println("Multiplication " + _item);
                    break;
                case "/":
                    System.out.println("Division " + _item);
                    break;
                default:
                    System.out.println("Invalid " + _item);
                    break;
            }
        }

    }
}