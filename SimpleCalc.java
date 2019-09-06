import java.util.*;
public class SimpleCalc {
    public static double performOperation(double initial, String action) throws UnknownOperatorException {
        String operator = action.substring(0, 1);
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && operator.equals("/") && !operator.equals("r") && !operator.equals("R")) {
            throw new UnknownOperatorException(operator);
        }
            if (operator.equals("r") || operator.equals("R")) {
                return initial;
            }
                double number = Double.parseDouble(action.substring(1, action.length()));
                System.out.println("result" + operator + " " + number + "=");
                if (operator.equals("+")) {
                    return initial += number;
                } else if (operator.equals("-")) {
                    return initial -= number;
                } else if (operator.equals("*")) {
                    return initial *= number;
                } else {
                    return initial /= number;
                }
            }
        }

