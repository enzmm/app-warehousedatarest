package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    String getCode();
    Integer getId();
    String getName();
    boolean getActive();
}
