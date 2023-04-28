package springboot.setterMethod.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResDto {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private int age;


    @QueryProjection
    public ResDto(Long userId, String name, String email, String password, int age) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
