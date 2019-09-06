import java.util.Scanner;

public class TestAll6 {
    public static void main(String[] args) {
        System.out.println("Updated Calculator---------------------------------------------------------------------------------");
        int var = 5;
        int var2 = 10;
        int var3= 15;
        newCalculator calculator=new newCalculator();
        System.out.println("Added together they are " + calculator.add(var, var2));
        System.out.println("Subtracted: " + calculator.subtract(var, var2));
        System.out.println("multiplied: " + calculator.multiply(var, var2));
        System.out.println("divided" + calculator.divide(var, var2));
        double average= ((var+var2+var3)/3);
        double StdDeviation= Math.sqrt((((var-average)*(var-average))+((var2-average)*(var2-average))+((var3-average)*(var3-average)))/3);
        System.out.println("The Standard Deviation of the original vars(not the input) is "+ StdDeviation);
        double average1=calculator.average();
        System.out.println(average1);
        System.out.println("Ch5 Ex1--------------------------------------------------------------------------------------------");
        HotDogStand hotdog= new HotDogStand(1,35);
        HotDogStand hotdog1= new HotDogStand(2,98);
        HotDogStand hotdog2= new HotDogStand(3,88);
        for(int i=0; i<10;i++){
            hotdog.JustSold();
            hotdog1.JustSold();
            hotdog2.JustSold();
        }
        System.out.println("Hot dog cart id: " +hotdog.id+ " sold: "+"sold: "+hotdog.NumSold());
        System.out.println("Hot dog cart id: " +hotdog1.id+ " sold: "+"sold: "+hotdog1.NumSold());
        System.out.println("Hot dog cart id: " +hotdog2.id+ " sold: "+"sold: "+hotdog2.NumSold());
        System.out.println("Total number of hotdogs sold: "+ HotDogStand.totalcount());
        System.out.println("Ch5 Ex2--------------------------------------------------------------------------------------------");
        Fraction fract=new Fraction(3, 5);
        fract.setNumerator();
        fract.setDenominator();
        fract.display();
        System.out.println("Enter the second fraction to see if it is equal to the first fraction");
        System.out.println("Numerator: ");
        Scanner scanner=new Scanner(System.in);
        int numerator2= scanner.nextInt();
        System.out.println("Denominator: ");
        int denominator2=scanner.nextInt();
        System.out.println("Equal? : "+fract.equals(numerator2, denominator2));
        System.out.println("Ch6 Ex1--------------------------------------------------------------------------------------------");
        Diving dive= new Diving((float)(6.7),(float)(6.8),(float)(8.5),(float)(9.4),(float)(8.5),(float)(2.4),(float)(9.9),(float)(3.1));
        dive.getScore();
        System.out.println("Ch6 Ex3--------------------------------------------------------------------------------------------");
        Boolean flag=false;
        Rain rain = new Rain(5, 4, 3, 2, 1, 0, 0, 0, 0, 2, 2, 3);
        Scanner in=new Scanner(System.in);
        while (flag==false) {
            rain.getMonth();
            rain.actual();
            System.out.println("Would you like to try again with a new set of values");
            String Continue=in.nextLine();
            if (Continue.equalsIgnoreCase("no")){
                flag=true;
            }
        }
        System.out.println("Ch6 Ex6---------------------------------------------------------------------------------------------");
        int i;
        Scanner len=new Scanner(System.in);
        System.out.println("What is the length of the array");
        i= len.nextInt();
        ArrayCounter arr=new ArrayCounter(i);
        arr.fillArray();
        System.out.println("Ch6 Ex10--------------------------------------------------------------------------------------------");
        TicTacToe tic=new TicTacToe();
        tic.TicTac();
    }
}
