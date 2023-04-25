package springboot.setterMethod.mapper;


import org.mapstruct.Mapper;
import springboot.setterMethod.dto.ReqDto;
import springboot.setterMethod.dto.ResDto;
import springboot.setterMethod.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(ReqDto reqDto);

    ResDto toDto(UserEntity userEntity);

}
