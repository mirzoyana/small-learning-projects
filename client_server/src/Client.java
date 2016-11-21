import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by amirzoya on 09/11/2016.
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket mySocket = new Socket("127.0.0.1", 8085);
            InputStreamReader inputStreamReader = new InputStreamReader(mySocket.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String msg = reader.readLine();
            System.out.println("You have new messages:  " + msg);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeMessage(Socket mySocket) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(mySocket.getOutputStream());
            writer.println("my message");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}