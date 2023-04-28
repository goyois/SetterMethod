package springboot.setterMethod.entity;


import lombok.*;

import javax.persistence.*;

/**
 * 1. 생성자 사용
 * 2. 빌더 패턴 사용 o
 * 3. 스태틱 메서드 사용
 */



@NoArgsConstructor
@Getter
//@Setter
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String password;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;


    @Builder  //빌더패턴 수정
    public UserEntity(Long userId, String name, String email, String password, int age) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }
}

