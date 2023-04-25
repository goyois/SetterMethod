package springboot.setterMethod.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReqDto {
    private String name;
    private String email;
    private String password;
    private int age;
}