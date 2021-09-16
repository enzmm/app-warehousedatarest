package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.OutputProduct;
import uz.pdp.appwarehouse.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();
}
