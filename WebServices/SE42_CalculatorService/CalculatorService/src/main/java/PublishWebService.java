import javax.xml.ws.Endpoint;
import webService.WebCalculator;
import webService.WebPizza;

public class PublishWebService {

    private static final String url = "http://localhost:9999/WebCalculator";

    public static void main(String[] args) {
        //Endpoint.publish(url, new WebCalculator());
        Endpoint.publish(url,new WebPizza());
    }
}
