import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

class ReceiveThread implements Runnable
{
    Socket sock=null;
    BufferedReader receive=null;

    public ReceiveThread(Socket sock) {
        this.sock = sock;
    }
    public void run() {
        try{
            receive = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));//get inputstream
            String msgRecieved = null;
            while((msgRecieved = receive.readLine())!= null)
            {
                System.out.println("From Server: " + msgRecieved);
                System.out.println("Please enter something to send to server..");
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }
}