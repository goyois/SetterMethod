package springboot.setterMethod.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import springboot.setterMethod.dto.ReqDto;
import springboot.setterMethod.dto.ResDto;
import springboot.setterMethod.entity.UserEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T17:09:03+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(ReqDto reqDto) {
        if ( reqDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setName( reqDto.getName() );
        userEntity.setEmail( reqDto.getEmail() );
        userEntity.setPassword( reqDto.getPassword() );
        userEntity.setAge( reqDto.getAge() );

        return userEntity;
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
