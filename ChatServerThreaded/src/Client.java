import java.net.*;
public class Client {
    public static void main(String[] args)
    {
        try {
            Socket sock = new Socket("localhost",444);

            SendThread sendThread = new SendThread(sock);
            Thread output = new Thread(sendThread);
            output.start();

            ReceiveThread receiveThread = new ReceiveThread(sock);
            Thread input =new Thread(receiveThread);
            input.start();

        } catch (Exception e) {System.out.println(e.getMessage());}
    }
}