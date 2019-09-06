import java.util.*;
public class AverageCalculator {
    public void average(){
        double total=0;
        int N, entry;
        int i=0;
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("How many numbers would you like to average");
            N=scanner.nextInt();
            if(N<0){
                throw new InputMismatchException();
            }
            while(i<N){
                System.out.println("Please enter a number");
                entry=scanner.nextInt();
                while(entry<0){
                    System.out.println("Invalid, Enter another int(positive)");
                    entry=scanner.nextInt();

                }
                total+=entry;
                i++;
            }
            System.out.println("The average of "+ N+" entered numbers is: "+(total/N));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid N must me a positive int");
        }


    }
}
