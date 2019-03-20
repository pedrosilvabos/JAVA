import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        final int port = 444;
        System.out.println("Server waiting for connection on port " + port);
        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();

        System.out.println("Received connection from " + clientSocket.getInetAddress() + " on port " + clientSocket.getPort());

        //manage them with thread pool!
        //create two threads to send and receive from client
        ReceiveFromClientThread receive = new ReceiveFromClientThread(clientSocket);
        Thread thread = new Thread(receive);
        thread.start();


        SendToClientThread send = new SendToClientThread(clientSocket);
        Thread thread2 = new Thread(send);
        thread2.start();
    }
}





