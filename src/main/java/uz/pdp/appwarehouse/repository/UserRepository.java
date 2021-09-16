package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.entity.User;
import uz.pdp.appwarehouse.projection.CustomSupplier;
import uz.pdp.appwarehouse.projection.CustomUser;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)

public interface UserRepository extends JpaRepository<User, Integer> {
}
