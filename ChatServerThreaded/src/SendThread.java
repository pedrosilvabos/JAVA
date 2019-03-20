import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class SendThread implements Runnable
{
    Socket sock=null;
    PrintWriter print=null;
    BufferedReader input =null;

    public SendThread(Socket sock)
    {
        this.sock = sock;
    }

    public void run(){
        try{
            if(sock.isConnected())
            {
                System.out.println("Client connected to "+sock.getInetAddress() + " on port "+sock.getPort());
                this.print = new PrintWriter(sock.getOutputStream(), true);
                while(true){

                    input = new BufferedReader(new InputStreamReader(System.in));
                    String msgToServerString=null;
                    msgToServerString = input.readLine();
                    this.print.println(msgToServerString);
                    this.print.flush();

                    if(msgToServerString.equals("EXIT"))
                        break;
                }
                sock.close();}}catch(Exception e){System.out.println(e.getMessage());}
    }
}