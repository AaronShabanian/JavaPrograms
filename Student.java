import java.util.ArrayList;
import java.util.Arrays;
// I could not figure out why it was not letting me import Comparable. It says that I do not have a compareTo method but I do. 
    public class Student implements Comparable {
        private String lastName;
        private int id;
        public Student(){
            lastName="";
            id=0;
        }
        public Student(String name, int id){
            lastName=name;
            this.id=id;
        }
        public void setName(String Name){
            lastName=Name;
        }
        public String getName(){
            return lastName;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getId(){
            return id;
        }


       public int compareTo(Student student){
            if(id<student.getId())
                return -1;
            else if (id>student.getId())
                return 1;
            else
                return 0;
        }

    }



