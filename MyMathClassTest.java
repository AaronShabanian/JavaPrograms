import java.util.ArrayList;
public class MyMathClassTest {
    public static void main(String[] args) {
        MyMathClass m=new MyMathClass();
        ArrayList intList=new ArrayList();
        intList.add(11);
        intList.add(13);
        intList.add(27);
        intList.add(55);
        intList.add(77);
        System.out.println("List of integer values "+ intList);
        System.out.println("Standard deviation: "+ m.standardDeviation(intList));
    }
}
