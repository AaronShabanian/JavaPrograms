import java.util.Scanner;
import java.util.Arrays;

public class Rain {
    private String Month;
    private int jan, feb, mar, apr, may,jun,jul,aug,sep,oct,nov,dec;
    public Rain(int jan, int feb, int mar, int apr, int may, int jun, int jul, int aug, int sep, int oct, int nov, int dec){
        this.jan=jan;
        this.feb=feb;
        this.mar=mar;
        this.apr=apr;
        this.may=may;
        this.jun=jun;
        this.jul=jul;
        this.aug=aug;
        this.sep=sep;
        this.oct=oct;
        this.nov=nov;
        this.dec=dec;
    }
    public void getMonth(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the 3 first three letter of the month");
        Month= scanner.nextLine();
    }
    public void actual(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the actual rainfall for January");
        double JanActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for February");
        double FebActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for March");
        double MarActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for April");
        double AprActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for May");
        double MayActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for June");
        double JunActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for July");
        double JulActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for August");
        double AugActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for September");
        double SepActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for October");
        double OctActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for November");
        double NovActual=scanner.nextDouble();
        System.out.println("Enter the actual rainfall for December");
        double DecActual=scanner.nextDouble();
        double[]rain=new double[12];
        double[]actual=new double[12];
        rain[0]=jan;
        actual[0]=JanActual;
        rain[1]=feb;
        actual[1]=FebActual;
        rain[2]=mar;
        actual[2]=MarActual;
        rain[3]=apr;
        actual[3]=AprActual;
        rain[4]=may;
        actual[4]=MayActual;
        rain[5]=jun;
        actual[5]=JunActual;
        rain[6]=jul;
        actual[6]=JulActual;
        rain[7]=aug;
        actual[7]=AugActual;
        rain[8]=sep;
        actual[8]=SepActual;
        rain[9]=oct;
        actual[9]=OctActual;
        rain[10]=nov;
        actual[10]=NovActual;
        rain[11]=dec;
        actual[11]=DecActual;
        double [] change = new double[12];
        for(int i=0; i<12; i++){
            change[i]=(Math.abs(rain[i]-actual[i]));
        }
        System.out.println("Current Month: "+ Month);
        System.out.println("             Jan  Feb  Mar  Apr  May  Jun  Jul  Aug  Sep  Oct  Nov  Dec");
        System.out.print("Average:    ");
        System.out.println(Arrays.toString(rain));
        System.out.print("Actual:     ");
        System.out.println(Arrays.toString(actual));
        System.out.print("Difference: ");
        System.out.println(Arrays.toString(change));

    }

}
