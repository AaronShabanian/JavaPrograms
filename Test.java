public class Test {
    public static void main(String[] args) {
        //Every problem is tested here
        System.out.println("This is Assignment 4, all classes are tested here. They are divided by barriers");
        System.out.println("Q2------------------------------------------------------------------------------------");
        Fraction fract=new Fraction();
        fract.setNumerator(10);
        fract.setDenominator(55);
        System.out.println(fract.decimal());
        fract.reduced();
        System.out.println("Q3------------------------------------------------------------------------------------");
        Odometer odom=new Odometer();
        odom.reset();
        odom.setMpg(22);
        odom.drive(209);
        odom.gasUsed();
        Odometer odom1=new Odometer();
        odom1.reset();
        odom1.setMpg(27);
        odom1.drive(309);
        odom1.gasUsed();
        System.out.println("Q4------------------------------------------------------------------------------------");
        BlogEntry blog=new BlogEntry("MrWriter", "This is a crazy blog post what makes it over ten words. " +
                "This homework is taking a long time", 2,19,2019);
        blog.DisplayEntry();
        System.out.println("Summary of blog post: "+blog.getSummary());
        System.out.println("Q5------------------------------------------------------------------------------------");
        Counter counter = new Counter();
        counter.increase();
        counter.decrease();
        counter.decrease();
        counter.increase();
        counter.increase();
        counter.printCount();
        System.out.println(counter.getCount());
        counter.setCount();
        System.out.println(counter.equals(1));
        counter.increase();
        System.out.println("Q6------------------------------------------------------------------------------------");
        Grader student1 = new Grader(9, 8, 10, 95, 86);
        Grader student2 = new Grader(6, 10, 8, 67, 75);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println("Student 1 quiz results");
        System.out.println(student1.getQuiz1());
        System.out.println(student1.getQuiz2());
        System.out.println(student1.getQuiz3());
        System.out.println("Student 1 Midterm result");
        System.out.println(student1.getMidterm());
        System.out.println("Student 1 Final Exam Result");
        System.out.println(student1.getFinalExam());
        System.out.println("Student 1 overall grade");
        System.out.println(student1.getOverall());
        System.out.println("Student 1 letter grade");
        System.out.println(student1.getLetterGrade());
        System.out.println(student1.equals(student2));
        System.out.println("Q7-----------------------------------------------------------------------------------------");
        Temperature temp=new Temperature(45,'F');
        Temperature temp1=new Temperature(76,'F');
        temp.setBooth(22,'C');
        temp.setDegrees(76);
        temp.setScale('F');
        System.out.println("Are the temperatures equal? : "+temp.equals(temp1));
        System.out.println("Q11-----------------------------------------------------------------------------------------");
        Pizza pizza=new Pizza("medium",3,4,5);
        pizza.setSize("large");
        pizza.setCheese(2);
        pizza.setPepperoni(3);
        pizza.setHam(2);
        System.out.println(pizza.getDescription());
        System.out.println("The Pizza's cost is: $"+pizza.calcCost());


    }

}
