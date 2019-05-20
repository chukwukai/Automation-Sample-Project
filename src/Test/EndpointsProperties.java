package Test;

import java.io.IOException;
import java.util.Properties;

public class EndpointsProperties {

    //Defines .properties file to reference
    private static final String ENDPOINT_PROPERTIES = "Endpoints.properties";

    //Declares java version of properties file.
    private final Properties endpoints_properties;

    //Defines the property name located in the .properties file
    private final String TRAVELS_URL = "Travels_Url";

    //Declares the java String for the Travels URL property
    private String travelsUrl;

    public EndpointsProperties() {

        endpoints_properties = new Properties();

        try {
            endpoints_properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(ENDPOINT_PROPERTIES));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading endpoints properties");
        }

        travelsUrl = endpoints_properties.getProperty(TRAVELS_URL);
    }

    //Returns the value of the private String
    public String getTravelsUrl() {
        return travelsUrl;
    }

}