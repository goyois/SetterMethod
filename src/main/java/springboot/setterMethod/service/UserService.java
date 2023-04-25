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
//        userEntity.setName("김주원");  기존 Setter 애너테이션 사용
//        userEntity.setEmail("bau12288@gmail.com");
//        userEntity.setAge(29);
//        userEntity.setPassword("xcz119");

        UserEntity.builder()
                .name(userEntity.getName())
                .age(userEntity.getAge())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .build();
        return userRepository.save(userEntity);
    }
}
