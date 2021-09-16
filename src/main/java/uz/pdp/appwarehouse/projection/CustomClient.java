package uz.pdp.appwarehouse.projection;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
