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
        UserEntity.builder() //비즈니스 로직에서 빌더태펀으로 파싱된 값을 가져와 저장
                .name(userEntity.getName())
                .age(userEntity.getAge())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .build();
        return userRepository.save(userEntity);
    }
}
