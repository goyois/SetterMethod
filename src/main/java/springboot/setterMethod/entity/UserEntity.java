package springboot.setterMethod.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 1. 생성자 사용
 * 2. 빌더 패턴 사용
 * 3. 스태틱 메서드 사용
 */



@NoArgsConstructor
@Getter
//@Setter
@Entity
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String password;
    private int age;


    @Builder
    public UserEntity(Long userId, String name, String email, String password, int age) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
