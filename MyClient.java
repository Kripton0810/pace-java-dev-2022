
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataInputStream reader = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str="",str2=""; 
            while (!str.equalsIgnoreCase("stop")) {
                str2 = br.readLine();
                out.writeUTF(str2);
                out.flush();
                str = reader.readUTF();
                System.out.println("Server Says: "+str);
            }
            out.close();
            s.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
