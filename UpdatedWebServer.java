import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class UpdatedWebServer {
    public static void main(String args[]) {
        try {
            ServerSocket serverSock = new ServerSocket(8000);
            while (true) {
                Socket connectionSock = serverSock.accept();
                ClientHandler handler = new ClientHandler(connectionSock);
                Thread someThread = new Thread(handler);
                someThread.run();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}