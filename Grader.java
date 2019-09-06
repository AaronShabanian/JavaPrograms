public class Grader {
    private int quiz1,quiz2,quiz3;
    private int midterm;
    private int finalExam;
    private double overall;
    private String letterGrade;
    public Grader(int one, int two, int three, int mid, int fin){
        quiz1=one;
        quiz2=two;
        quiz3=three;
        midterm=mid;
        finalExam=fin;
        calculateOverall();
        calculateLetterGrade();
    }
    public void calculateOverall(){
        overall=0;
        overall+=25*((double)quiz1+quiz2+quiz3)/30;
        overall+=35*(((double)midterm/100));
        overall+=40*((double)finalExam/100);
    }
    public void calculateLetterGrade(){
        if (overall>=90){
            letterGrade="A";
        }
        else if(overall>=80){
            letterGrade="B";
        }
        else if(overall>=70){
            letterGrade="C";
        }
        else if(overall>=60){
            letterGrade="D";
        }
        else{
            letterGrade="F";
        }
    }
    public int getQuiz1(){
        return quiz1;
    }
    public int getQuiz2(){
        return quiz2;
    }
    public int getQuiz3(){
        return quiz3;
    }
    public int getMidterm(){
        return midterm;
    }
    public int getFinalExam(){
        return finalExam;
    }
    public String getLetterGrade(){
        return letterGrade;
    }
    public double getOverall(){
        return overall;
    }
    public void setQuiz1(int newScore){
        quiz1=newScore;
        calculateOverall();
        calculateLetterGrade();
    }
    public void setQuiz2(int newScore){
        quiz2=newScore;
        calculateOverall();
        calculateLetterGrade();
    }
    public void setQuiz3(int newScore){
        quiz3=newScore;
        calculateOverall();
        calculateLetterGrade();
    }
    public void setMidterm(int newScore){
        midterm=newScore;
        calculateOverall();
        calculateLetterGrade();
    }
    public void setFinal(int newScore){
        finalExam=newScore;
        calculateOverall();
        calculateLetterGrade();
    }
    public String toString(){
        return "Grade of the student is "+letterGrade+" with a score of"+overall;
    }
    public boolean equals(Grader other){
        return overall==other.overall;
    }
}
