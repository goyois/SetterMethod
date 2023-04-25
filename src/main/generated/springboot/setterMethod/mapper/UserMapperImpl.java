package springboot.setterMethod.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import springboot.setterMethod.dto.ReqDto;
import springboot.setterMethod.dto.ResDto;
import springboot.setterMethod.entity.UserEntity;
import springboot.setterMethod.entity.UserEntity.UserEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T17:21:02+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(ReqDto reqDto) {
        if ( reqDto == null ) {
            return null;
        }

        UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.name( reqDto.getName() );
        userEntity.email( reqDto.getEmail() );
        userEntity.password( reqDto.getPassword() );
        userEntity.age( reqDto.getAge() );

        return userEntity.build();
    }

    @Override
    public ResDto toDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        ResDto resDto = new ResDto();

        resDto.setUserId( userEntity.getUserId() );
        resDto.setName( userEntity.getName() );
        resDto.setEmail( userEntity.getEmail() );
        resDto.setPassword( userEntity.getPassword() );
        resDto.setAge( userEntity.getAge() );

        return resDto;
    }
}
