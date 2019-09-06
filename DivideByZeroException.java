public class DivideByZeroException extends Exception
{
    public DivideByZeroException()
    {
        super("Error: cannot divide by zero.");
    }
    public DivideByZeroException(String message)
    {
        super(message);
    }
}