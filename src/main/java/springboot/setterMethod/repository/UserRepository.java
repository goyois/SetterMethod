package springboot.setterMethod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.setterMethod.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
}
