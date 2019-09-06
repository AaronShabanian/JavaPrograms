import java.util.Scanner;

public class TestAll {
    public static void main(String[] args) {
        System.out.println("Ch8Ex2-------------------------------------------------------------------------------------------------");
        Action action = new Action("R", 1, "James Bond");
        Comedy comedy = new Comedy("PG13", 2, "Grownups");
        Drama drama = new Drama("PG", 3, "StarWars");
        System.out.println(action.getTitle());
        System.out.println(action.getID());
        System.out.println(action.getRating());
        System.out.println(action.calcLateFees(3));
        System.out.println(comedy.getTitle());
        System.out.println(comedy.getID());
        System.out.println(comedy.getRating());
        System.out.println(comedy.calcLateFees(5));
        System.out.println(drama.getTitle());
        System.out.println(drama.getID());
        System.out.println(drama.getRating());
        System.out.println(drama.calcLateFees(4));
        System.out.println(drama.equals(comedy));
        System.out.println();
        System.out.println("Ch8Ex5-------------------------------------------------------------------------------------------------");
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        rect.erase();
        rect.draw();
        rect.center();
        tri.center();
        System.out.println("Ch8Ex9--------------------------------------------------------------------------------------------------");
        LoadedDice load = new LoadedDice();
        load.printDiceRolls();
        System.out.println("Ch9Ex1--------------------------------------------------------------------------------------------------");
        AverageCalculator av = new AverageCalculator();
        av.average();
        System.out.println("Ch9Ex2--------------------------------------------------------------------------------------------------");
        Divide div = new Divide();
        div.divide();
        System.out.println("Ch9Ex6--------------------------------------------------------------------------------------------------");
        //Couldnt get the whole program to work
        Scanner scan = new Scanner(System.in);
        String decision = "y";
        System.out.println("Calculator is on");
        while (decision.charAt(0) == 'y') {
            double result = 5;
            String operator = "";
            System.out.println("Result= " + result);
            while (!operator.equals("R") && operator.equals("r")) {
                operator = scan.nextLine();
                try {
                    result = SimpleCalc.performOperation(result, operator);
                    if (!operator.equals("R") && !operator.equals("r")) {
                        System.out.println(result);
                        System.out.println("Updated Result= " + result);
                    }
                } catch (UnknownOperatorException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Type the last line again");
                }
            }

            System.out.println("Final result = " + result);
            System.out.println("Again y for yes, n for no");
            decision = scan.nextLine();
        }
        System.out.println("End of Program");
        System.out.println("Ch9Ex7-----------------------------------------------------------------------------------------------------");
        Account a = new Account(100);
        System.out.println(a.getBalance());
        try{
            a.withdraw(20);
        }
        catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.getBalance());
        try{
            a.withdraw(-1);
        }
        catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.getBalance());

        try{
            a.deposit(50);
        }
        catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.getBalance());

    }
}


