

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();// waiting for client to connect....
            DataInputStream reader = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String client="",server=""; 
            while (!server.equalsIgnoreCase("stop")) {
                client = reader.readUTF();
                System.out.println("Client Says: "+client);
                server = br.readLine();
                out.writeUTF(server);
                out.flush();
            }
            out.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
