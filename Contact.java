public class Contact
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    public Contact(String fn, String ln, String pn,
                   String e)
    {
        firstName = fn;
        lastName = ln;
        phoneNumber = pn;
        email = e;
    }
    public void setFirstName(String name){
        firstName=name;
    }
    public void setLastName(String name){
        lastName=name;
    }
    public void setPhoneNumber(String number){
        phoneNumber=number;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

}
