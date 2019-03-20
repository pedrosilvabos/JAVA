import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

class ReceiveFromClientThread implements Runnable {
    Socket clientSocket = null;
    BufferedReader bufferedReader = null;

    public ReceiveFromClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));

            String messageString; //initialize

            while (true) {
                while ((messageString = bufferedReader.readLine()) != null) {
                    //assign message from client to messageString
                    if (messageString.equals("EXIT")) {
                        break;
                    }
                    System.out.println("From Client: " + messageString);//print the message from client
                }
                this.clientSocket.close();
                System.exit(0);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
