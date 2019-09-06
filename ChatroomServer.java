import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ChatroomServer {
    public static void main(String args[])
    {
        boolean dog=false;
        try
        {
            System.out.println("Waiting for connection to port 8000.");
            ServerSocket serverSock =
                    new ServerSocket(8000);
            Socket connectionSock = serverSock.accept();
            BufferedReader clientInput =
                    new BufferedReader(
                            new InputStreamReader(
                                    connectionSock.getInputStream()));
            DataOutputStream clientOutput =
                    new DataOutputStream(
                            connectionSock.getOutputStream());
            System.out.println("Connection made.");
            String body = " The Chatroom has been created ";
            ChatClient handler = new ChatClient(connectionSock);
            Thread someThread = new Thread(handler);
            Thread thread2= new Thread(handler);
            Thread thread3= new Thread(handler);
            String answer;
            while(true) {
                System.out.println("Person 1: ");
                someThread.run();
                System.out.println("Person 2: ");
                thread2.run();
                System.out.println("Person 3: ");
                thread3.run();
                System.out.println("Would you like to end the room");
                Scanner scanner=new Scanner(System.in);
                answer=scanner.nextLine();
                if(answer.equalsIgnoreCase("yes")) {
                   break;
                }
            }
                clientOutput.close();
                clientInput.close();
                connectionSock.close();
                serverSock.close();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

