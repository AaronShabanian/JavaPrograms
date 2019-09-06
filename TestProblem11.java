import java.util.Arrays;
public class TestProblem11 {
    public static void main(String[] args) {
        final int SIZE=5;
        Student[] studentList=new Student[SIZE];
        studentList[0]=new Student("Jessica",100);
        studentList[1]=new Student("Emily",165);
        studentList[2]=new Student("Michelle",121);
        studentList[3]=new Student("Julia",213);
        studentList[4]=new Student("Sarah",343);
        Arrays.sort(studentList);
        for(Student student:studentList){
            System.out.println(student.getName()+ " "+student.getId());
        }


    }
}
