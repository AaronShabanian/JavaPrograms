import java.util.Scanner;

public class Columbus {
    private String name1;
    private String name2;
    private String name3;
    private String boat1;
    private String boat2;
    private String boat3;
    private int speed=5;
    private int distance=4200;
    public int path;
    public Columbus(String name1, String name2, String name3, String boat1, String boat2, String boat3){
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.boat1=boat1;
        this.boat2=boat2;
        this.boat3=boat3;
    }
    public void setBoatName(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name for Boat 1");
        boat1=input.nextLine();
        System.out.println("Enter name for Boat 2");
        boat2=input.nextLine();
        System.out.println("Enter name for Boat 3");
        boat3=input.nextLine();
    }
    public void setPath(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter path 1,2 or 3");
        path=scanner.nextInt();
    }
    public void Path1() {
        int counter = 0;
        int miles = 0;
        int hours = 0;
        int day = 1;
        int check=0;
        System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Lisbon. " +
                "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
        while (miles < distance) {
            while (miles < 3000) {
                while (counter < 200) {
                    counter += speed;
                    miles += speed;
                    hours += 1;
                    if (hours == 24) {
                        day++;
                        hours = 0;
                    }
                }
                counter = 0;
                System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                        " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                        "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
            }
            if (check==0) {
                System.out.println("You have hit ice slowing your speed to 1 mph");
                check++;
            }
            speed = 1;
            while (counter < 200) {
                counter += speed;
                miles += speed;
                hours += 1;
                if (hours == 24) {
                    day++;
                    hours = 0;
                }
            }
            System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                    " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                    "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
            counter = 0;

        }
        System.out.println("Journey complete, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Carribean " +
                "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);

    }
    public void Path2() {
        int counter = 0;
        int miles = 0;
        int hours = 0;
        int day = 1;
        int check=0;
        System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Lisbon. " +
                "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
        while (miles < distance) {
            while (miles < 2500) {
                while (counter < 200) {
                    counter += speed;
                    miles += speed;
                    hours += 1;
                    if (hours == 24) {
                        day++;
                        hours = 0;
                    }
                }
                counter = 0;
                System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                        " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                        "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
            }
            speed = 3;
            while (counter < 200) {
                counter += speed;
                miles += speed;
                hours += 1;
                if (hours == 24) {
                    day++;
                    hours = 0;
                }
            }
            if (check==0) {
                System.out.println("Your speed has been reduced to 3mph because of a 2mph headwind and " + boat1 + " and " + boat2 + " Have been sucked into a whirpool and have drowned");
                check++;
            }
            counter = 0;
            System.out.println("Status Report, Captain: " + name3 + " "+ boat3 + " Current Speed: " + speed + "" +
                    " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                    "Other Captains: NONE" );

        }
        System.out.println("Journey complete, Captain: " + name3 + " "+ boat3 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Carribean " +
                "Other Captains: NONE" );
    }
    public void Path3() {
        int counter = 0;
        int miles = 0;
        int hours = 0;
        int day = 1;
        int check=0;
        System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Lisbon. " +
                "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
        while (miles < distance) {
            while (miles < 400) {
                while (counter < 200) {
                    counter += speed;
                    miles += speed;
                    hours += 1;
                    if (hours == 24) {
                        day++;
                        hours = 0;
                    }
                }
                counter = 0;
                System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                        " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                        "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
            }
            speed = 10;
            if(check==0){
                System.out.println("You have found a favorable tailwind which has increased your speed to 10mph");
                check++;
            }
            while (counter < 200) {
                counter += speed;
                miles += speed;
                hours += 1;
                if (hours == 24) {
                    day++;
                    hours = 0;
                }
            }
            System.out.println("Status Report, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                    " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Atlantic. " +
                    "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
            counter = 0;

        }
        System.out.println("Journey complete, Captain: " + name1 + " "+ boat1 + " Current Speed: " + speed + "" +
                " mph, Distance: " + miles + " miles, Day of Voyage: " + day + " Location: Carribean " +
                "Other Captains: " + name2 + ", "+ boat2 +" ."+ name3+ ", "+boat3);
    }
}
