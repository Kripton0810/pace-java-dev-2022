import java.net.MalformedURLException;
import java.net.URL;

public class URLCheck {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://raichandgroup.com/");
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println(url.getHost());
            System.out.println(url.getFile());
            System.out.println(url.getPort());
            
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
