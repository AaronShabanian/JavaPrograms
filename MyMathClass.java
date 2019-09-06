import java.util.ArrayList;
import java.lang.Integer;
public class MyMathClass {
    public MyMathClass(){}
    public double standardDeviation(ArrayList list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        double total=0.0;
        double average =0;
        double d=0;
        double sd=0;
        for (int i = 0; i < list.size(); i++)
            total+=(int)list.get(i);

    average=total/list.size();
        for(int i = 0; i < list.size(); i++){
            d+=Math.pow((int)(list.get(i))-average,2.0);
        }
        sd=Math.sqrt(d/list.size());
        return sd;
    }

}

