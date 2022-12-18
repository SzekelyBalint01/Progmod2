package ho.pte.pteprogmoditalbolt.controller;

import ho.pte.pteprogmoditalbolt.dto.UserDto;
import ho.pte.pteprogmoditalbolt.modell.User;
import ho.pte.pteprogmoditalbolt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDto user){
        User newUser = userService.createUser(user);
        return ResponseEntity.ok(newUser);
    }
}
