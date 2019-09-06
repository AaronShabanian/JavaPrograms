import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileFinder {
    private PrintWriter printWriter = null;
    private PrintWriter concatinate = null;
    private BufferedReader reader = null;
    private boolean flag = false;
    private boolean log = false;
    private String file;

    public FileFinder() {

    }

    public void runFile() {
        String homeDir = System.getProperty("user.home");
        Scanner scanner = new Scanner(System.in);
        while (flag == false) {
            System.out.println("Would you like to have all contents written in a log file?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                flag = true;
                this.log = true;
                try {
                    System.out.println("Enter the name of the file");
                    this.file = scanner.nextLine();
                    this.printWriter = new PrintWriter(file, "UTF-8");
                } catch (IOException e) {
                    System.out.println("Exception Happened");
                }
            } else if (answer.equalsIgnoreCase("no")) {
                flag = true;
            } else {
                System.out.println("Not a valid answer, please enter yes or no");
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Path of directory you would like to find the contents of");
            String directory = scan.nextLine();
            File folder = null;
            try {
                folder = new File(directory);
            } catch (Exception e) {
                System.out.println("Directory could not be found");
            }
            File[] listOfFiles = folder.listFiles();
            System.out.println("Contents of directory--------------------------------------------------------------------------");
            if (log == true) {
                this.printWriter.println("Contents of directory--------------------------------------------------------------------------");
            }
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getName());
                    if (log == true) {
                        this.printWriter.println("File " + listOfFiles[i].getName());
                    }
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                    if (log == true) {
                        this.printWriter.println("Directory " + listOfFiles[i].getName());
                    }
                }
            }
            System.out.println("Contents of directory including all of the subdirectories-------------------------------");
            if (log == true) {
                this.printWriter.println("Contents of directory including all subdirectories--------------------------------------------------------------------------");
            }
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getAbsolutePath());
                    if (log == true) {
                        this.printWriter.println("File " + listOfFiles[i].getAbsolutePath());
                    }
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getAbsolutePath());
                    if (log == true) {
                        this.printWriter.println("Directory " + listOfFiles[i].getAbsolutePath());
                    }
                }
            }
            System.out.println("What file do you want to find in this directory?");
            String myFile = scan.next();

            File files = new File(directory);
            String Location = null;
            File[] list;
            boolean flag1 = true;
            while (flag1 == true) {
                list = files.listFiles();
                for (int i = 0; i < list.length; i++) {
                    if (list[i].isFile()) {
                        if (list[i].getName().equalsIgnoreCase(myFile)) {
                            Location = list[i].getAbsolutePath();
                            flag1 = false;
                        }
                    }

                }
            }
            System.out.println(Location);
            if (log == true) {
                printWriter.println("File Location----------------------------------------------------------------------------------");
                printWriter.println("File is located at: " + Location);
            }
            list = files.listFiles();
            System.out.println("Please enter file extension");
            Scanner input = new Scanner(System.in);
            String extension = input.nextLine();
            for (int i = 0; i < list.length; i++) {
                if (list[i].isFile()) {
                    if (list[i].getName().endsWith(extension)) {
                        System.out.println(list[i]);
                        System.out.println(list[i].getAbsolutePath());
                        if (log == true) {
                            printWriter.println("Files with your given extension are________________________________________________________________________");
                            printWriter.println(list[i]);
                            printWriter.println(list[i].getAbsolutePath());
                        }

                    }
                }

            }
            System.out.println("What will the name for the combined file be? ");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            try {
                concatinate = new PrintWriter(name, "UTF-8");
            } catch (IOException e) {
                System.out.println("There was an error");
            }
            System.out.println("What is the name of file 1");
            String file1=in.nextLine();
            try {
                reader = new BufferedReader(new FileReader(file1));
            }
            catch(Exception e){
                System.out.println("Exception happened");
            }
            String ln=null;
            try {
                ln = reader.readLine();
            }
            catch(IOException e){
                System.out.println("Exception happened");
            }
            System.out.println();
            while (ln != null)
            {
                concatinate.println(ln);
                try {
                    ln = reader.readLine();
                }
                catch(IOException e){
                    System.out.println("Error");
                }
            }
            System.out.println("What is the name of file2?");
            String file2=in.nextLine();
            try {
                reader = new BufferedReader(new FileReader(file2));
                ln=reader.readLine();
            }
            catch(Exception e){
                System.out.println("Exception happened");
            }
            while (ln != null)
            {
                concatinate.println(ln);
                try {
                    ln = reader.readLine();
                }
                catch(IOException e){
                    System.out.println("Error");
                }
            }
            concatinate.flush();
            concatinate.close();
            try {
                reader.close();
            }
            catch(IOException e){
                System.out.println("Exception");
            }
            System.out.println("Your new file has been created");
            if (log == true) {
                printWriter.println("Your new file containing: "+file1+" and "+file2+" has been created");
                printWriter.flush();
                printWriter.close();
            }
        }
    }
}



