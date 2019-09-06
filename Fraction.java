import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void setNumerator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the numerator");
        numerator=scanner.nextInt();
    }
    public void setDenominator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the denominator");
        denominator=scanner.nextInt();
    }
    public void display(){
        System.out.println(numerator+ "/"+denominator);
    }
    public boolean equals(int numerator2, int denominator2){
       double ratio=(double) numerator/denominator;
       double ratio2=(double) numerator2/denominator2;
       if (ratio==ratio2)
           return true;
       else
           return false;
    }
}
