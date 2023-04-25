package springboot.setterMethod.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.setterMethod.entity.UserEntity;
import springboot.setterMethod.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserEntity createUser(UserEntity userEntity) {
        userEntity.setName("김주원");
        userEntity.setEmail("bau12288@gmail.com");
        userEntity.setAge(29);
        userEntity.setPassword("xcz119");
        return userRepository.save(userEntity);
    }
}
