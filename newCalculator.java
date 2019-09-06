import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class newCalculator{
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double average(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers would you like to average");
        int num=scanner.nextInt();
        int counter=0;
        int[]arr=new int[num];
        while ((num-1)>=counter){
            System.out.println("Enter a number");
            int number=scanner.nextInt();
            arr[counter]=number;
            counter++;
        }
        counter=0;
        int sum=0;
        while((num-1)>=counter){
            sum+=arr[counter];
            counter++;
        }
        double ave= sum/num;
        return ave;

    }


    public static void main(String[] args){
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
    }
}