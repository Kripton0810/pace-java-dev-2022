import java.io.InputStream;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Climnsi {
    public static void main(String[] args) throws SocketException {
        // try{    
        //     // URL url=new URL("https://luckskull.com/api/website");
            
        //     // HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
        //     // System.out.println(con.getResponseMessage());
        //     }catch(Exception e){System.out.println(e);}    
            // try{  
            //     InetAddress ip=InetAddress.getByName("localhost");  
                  
            //     System.out.println("Host Name: "+ip.getHostName());  
            //     System.out.println("IP Address: "+ip.getHostAddress());  
                
            //     }catch(Exception e){System.out.println(e);}  
            try(final DatagramSocket socket = new DatagramSocket()){
                try {
                    socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
                } catch (UnknownHostException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                String ip = socket.getLocalAddress().getHostAddress();
                System.out.println(ip);
              }
    } 
}
