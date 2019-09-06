import java.io.*;
import java.net.Socket;
import java.util.*;

public class ClientHandler implements Runnable {
    private Socket socket;
    public ClientHandler(Socket s){
        socket=s;
    }
    public void run(){
        try{
            BufferedReader clientInput=new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));
            DataOutputStream clientOutput=new DataOutputStream(socket.getOutputStream());
            Scanner scanner=new Scanner(new File("//Users//aaronshabanian//OneDrive - Chapman University//CPSC231//Homework11//src//webpage.txt"));
            String input="HTTP/1.0 200 OK\n\n";
            while (scanner.hasNextLine()){
                input+=scanner.nextLine();
            }
            clientOutput.writeBytes(input);
            clientOutput.close();
            socket.close();
            clientInput.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
