package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.AttachmentContent;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    String getContentType();
    long  getSize();
}
