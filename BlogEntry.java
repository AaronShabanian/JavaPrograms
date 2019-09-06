import java.util.Date;
public class BlogEntry {
    private String username;
    private String text;
    private Date TheDate;
    public BlogEntry(String name, String input, int month, int day, int year){
        username=name;
        text=input;
        TheDate=new Date(month,day,year);
    }
    public void DisplayEntry(){
        System.out.println("Author: "+username);
        System.out.println("Date: "+TheDate);
        System.out.println(text);
    }
    public String getSummary(){
        String summary="";
        int spaceCount=0;
        int subscript=0;
        while(spaceCount<=9&&subscript<text.length()) {
            String nextChar = text.substring(subscript, subscript + 1);
            if (nextChar.equals(" ")) {
                if (spaceCount <= 9)
                    spaceCount++;
                else
                    break;
            }
            summary += nextChar;
            subscript++;
        }
        return summary;
        }

    }


