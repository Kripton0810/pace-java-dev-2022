import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class Climnsi {
    public static void main(String[] args) {
        try{    
            URL url=new URL("https://luckskull.com/api/website");
            
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            System.out.println(con.getResponseMessage());
            }catch(Exception e){System.out.println(e);}    
            try{  
                InetAddress ip=InetAddress.getByName("www.fliphtml5.com");  
                  
                System.out.println("Host Name: "+ip.getHostName());  
                System.out.println("IP Address: "+ip.getHostAddress());  
                }catch(Exception e){System.out.println(e);}  
    } 
}
