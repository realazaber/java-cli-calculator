import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> _equation = new ArrayList<String>();

        

        _equation.add("5");
        _equation.add("+");
        _equation.add("1");
        _equation.add("*");
        _equation.add("2");

        int _counter = 0;

        String _operator = "";
        boolean _calculate = false;
        boolean _number = false;

        int _result = 0;

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
                System.out.println("Number: " + _item);
                //do calculation
                switch (_operator) {
                    case "+":
                        _result += Integer.valueOf(_item);
                        break;
                    case "-":
                        _result -= Integer.valueOf(_item);
                        break;
                    case "*":
                        _result *= Integer.valueOf(_item);
                        break;
                    case "/":
                        _result /= Integer.valueOf(_item);
                        break;
                    default:
                        //System.out.println("Invalid operator");
                        _result = Integer.valueOf(Integer.toString(_result) + _item);
                        break;
                }
                    

                    _number = true;
                    break;
                case "+":
                    System.out.println("Addition: " + _item);
                    _operator = "+";
                    _number = false;
                    break;
                case "-":
                    System.out.println("Substraction: " + _item);
                    _operator = "-";
                    _number = false;
                    break;
                case "*":
                    System.out.println("Multiplication: " + _item);
                    _operator = "*";
                    _number = false;
                    break;
                case "/":
                    System.out.println("Division: " + _item);
                    _operator = "/";
                    _number = false;
                    break;
                default:
                    System.out.println("Invalid " + _item);
                    break;
            }

            _counter++;
        }

        System.out.println("=========\nResult: " + _result);
    }
}