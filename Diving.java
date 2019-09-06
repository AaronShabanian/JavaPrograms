import java.util.Arrays;
public class Diving {
    private float score1, score2, score3, score4, score5, score6, score7, difficulty;
    public Diving(float score1,float score2,float score3,float score4, float score5, float score6, float score7, float difficulty){
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
        this.score4=score4;
        this.score5=score5;
        this.score6=score6;
        this.score7=score7;
        this.difficulty=difficulty;
    }
    public void getScore(){
        float[]scores=new float[7];
        scores[0]=score1;
        scores[1]=score2;
        scores[2]=score3;
        scores[3]=score4;
        scores[4]=score5;
        scores[5]=score6;
        scores[6]=score7;
        Arrays.sort(scores);
        float[]realScores=new float[5];
        for(int i=1, j=0; i<6; i++,j++){
            realScores[j]=scores[i];
        }
        float sum=0;
        for(int i=0; i<5; i++){
            sum+=realScores[i];
        }
        float newSum=sum*difficulty;
        float finalSum=(float)(newSum*.6);
        System.out.println("The Diver's dive had a difficulty level of :"+ difficulty+" and had a final score of "+ finalSum);
    }
}
