import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ConnectServer
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(
                    "Waiting for connection to port 8000.");
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
            String body = " This is the webserver that is hosted by Aaron Shabanian";
            String text = "HTTP/1.0 200 OK\n\n" + body;
            clientOutput.writeBytes(text);
            System.out.println("Data sent.");
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