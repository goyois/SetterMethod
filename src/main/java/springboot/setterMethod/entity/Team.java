package springboot.setterMethod.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TeamId;
    private String name;

    @OneToMany(mappedBy = "UserEntity")
    List<UserEntity> userEntity = new ArrayList<>();


    @Builder
    public Team(Long teamId, String name) {
        TeamId = teamId;
        this.name = name;
    }
}
