public class UnknownOperatorException extends Exception{
    public UnknownOperatorException(String operator){
        super(operator+" is an unknown operator");
    }
}
