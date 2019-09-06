public class Movie

{
    private String rating;
    private int ID;
    private String title;
    public Movie(String theRating, int theId, String theTitle)
    {
        rating = theRating;
        ID = theId;
        title = theTitle;
    }
    public String getRating()
    {
        return rating;
    }

    public int getID()
    {
        return ID;
    }

    public String getTitle()
    {
        return title;
    }
    public boolean equals(Movie other)
    {
        if(other.getID() == ID)
            return true;
        else
            return false;
    }
    public double calcLateFees(int days)
    {
        return days * 2;
    }

}