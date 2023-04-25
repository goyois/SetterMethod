package springboot.setterMethod.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.setterMethod.dto.ReqDto;
import springboot.setterMethod.entity.UserEntity;
import springboot.setterMethod.mapper.UserMapper;
import springboot.setterMethod.service.UserService;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody ReqDto reqDto) {
        UserEntity user = userService.createUser(userMapper.toEntity(reqDto));
        return new ResponseEntity(HttpStatus.OK);
    }

}
