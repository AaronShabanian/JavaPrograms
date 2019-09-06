import java.io.*;
import java.net.Socket;
import java.util.*;

public class ChatClient implements Runnable {
    private Socket socket;
    public ChatClient(Socket s){
        socket=s;
    }
    public void run(){
        try {
                BufferedReader clientInput = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
                DataOutputStream clientOutput = new DataOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);
                String input = "HTTP/1.0 200 OK\n\n";
                input+="Chat member: ";
                input += scanner.nextLine();
                input+="                                                                                                                                                 ";

                clientOutput.writeBytes(input);
//                clientOutput.close();
//                socket.close();
//                clientInput.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}