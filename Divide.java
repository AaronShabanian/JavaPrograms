import java.util.InputMismatchException;
import java.util.Scanner;
public class Divide {
    public void divide() {
        boolean invalidInput = true;
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        double r = 0;

        while (invalidInput){
            try{
                System.out.println("Enter first int: ");
                n1=scanner.nextInt();
                System.out.println("Enter second int: ");
                n2=scanner.nextInt();
                if(n2==0){
                    throw new DivideByZeroException("Cannot divide by zero");
                }
                r=(double)n1/n2;
                invalidInput=false;

            }
            catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Enter an integer value");

            }
            catch(DivideByZeroException e){
                scanner.nextLine();
                System.out.println(e.getMessage());
            }
        }
        System.out.println(n1+" divided by "+n2+" is "+r);
    }
}
