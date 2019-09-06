import java.util.ArrayList;
import java.util.*;
public class TestProblem2 {


    private boolean flag=true;

    public static void main(String[] args) {
        ArrayList contacts = new ArrayList();


        while (true) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Choice");
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Display specific contact");
            System.out.println("4. Delete a contact");
            System.out.println("-1. Quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("First Name: ");
                    String fn = scan.nextLine();
                    System.out.println("Last Name: ");
                    String ln = scan.nextLine();
                    System.out.println("Phone Number: ");
                    String pn = scan.nextLine();
                    System.out.println("Email Address");
                    String ea = scan.nextLine();
                    contacts.add(new Contact(fn, ln, pn, ea));
                    break;
                case 2:
                    for (int i = 0; i < contacts.size();) {
                        Contact c = (Contact) contacts.get(i);
                        System.out.println(c.getLastName() + ", " + c.getFirstName());
                        System.out.println("Phone number " + c.getPhoneNumber());
                        System.out.println("Email " + c.getEmail());
                    }
                    break;
                case 3:
                    System.out.println("Enter an information piece about person");
                    String info = scan.nextLine();
                    Contact c = findPerson(contacts, info);
                    if (c != null) {
                        System.out.println(c.getLastName() + ", " + c.getFirstName());
                        System.out.println("Phone Number " + c.getPhoneNumber() + " Email: " + c.getEmail());
                    } else {
                        System.out.println("Person not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter an information piece about the person");
                    String someInfo = scan.nextLine();
                    Contact contact = findPerson(contacts, someInfo);
                    if (contact != null) {
                        System.out.println(contact.getLastName() + ", " + contact.getFirstName());

                        System.out.println("Phone number " + contact.getPhoneNumber() + "Email " + contact.getEmail());
                        System.out.println("Delete Contact(Y/N)?");
                        String delete = scan.nextLine();
                        if (delete.equalsIgnoreCase("y")) {
                            contacts.remove(contact);
                            System.out.println("Deleted");
                        }
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;


            }
            if (choice == -1) {
                break;
            }
        }
    }
    private static Contact findPerson(ArrayList contacts, String info){
        Contact c=null;
        for(int i = 0; i<contacts.size();i++){
            Contact cont=(Contact)contacts.get(i);
            String nam=cont.getFirstName();
            if(nam.indexOf(info)!=-1)
                c=(Contact)contacts.get(i);
            if(nam.indexOf(info)!=-1)
                c=(Contact)contacts.get(i);
            if(nam.indexOf(info)!=-1)
                c=(Contact)contacts.get(i);
            if(nam.indexOf(info)!=-1)
                c=(Contact)contacts.get(i);
        }
        return c;
    }
}
