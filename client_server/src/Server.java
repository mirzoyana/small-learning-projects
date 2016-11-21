import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by amirzoya on 09/11/2016.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket myServerSocket = new ServerSocket(8085);
            while (true) {
                Socket socket = myServerSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println("my message");
                writer.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
