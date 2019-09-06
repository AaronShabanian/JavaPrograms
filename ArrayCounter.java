import java.util.Arrays;
import java.util.Scanner;

public class ArrayCounter {
    private int i;
    public ArrayCounter(int i){
        this.i=i;
    }
    public void fillArray(){
        Scanner in =new Scanner(System.in);
        int[] count =new int[this.i];
        for(int j=0; j<i; j++){
            System.out.println("Enter int of the array");
            count[j]=in.nextInt();
        }
        Arrays.sort(count);
        int[] single =new int[50];
        single[0]=count[0];
        for(int k=0,l=1; k<i; k++){
            if (single[l-1]!=count[k]){
                single[l]=count[k];
                l++;
            }
        }
        int num=0;
        for(int p=0; p<50;p++){
            if(single[p]!=0){
                num++;
            }
        }
        int[] update=new int[num];
        for(int p=0; p<num;p++){
            update[p]=single[p];
        }
        int[]amount=new int[num];
        int counter=0;
        for(int r=0,l=0; r<i; r++){
            if (update[l]==count[r]){
                counter++;
            }
            else if (r==(i-1)){
                amount[l]=counter;
                counter=1;
                l++;
            }
            else{
                amount[l]=counter;
                counter=1;
                l++;
            }
        }
        //I cant figure out why the counter for the last number isnt working correctly but the counter for all other numbers works
        System.out.println("N      Count");
        for(int j=0; j<num;j++){
            System.out.println(update[j]+"        "+ amount[j]);
        }
    }
}
