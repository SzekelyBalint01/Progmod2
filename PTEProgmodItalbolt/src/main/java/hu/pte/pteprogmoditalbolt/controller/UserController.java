package hu.pte.pteprogmoditalbolt.controller;

import hu.pte.pteprogmoditalbolt.dto.UserDto;
import hu.pte.pteprogmoditalbolt.modell.User;
import hu.pte.pteprogmoditalbolt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("users")
    public ResponseEntity<User> createUser(@RequestBody UserDto user){
        User newUser = userService.createUser(user);
        return ResponseEntity.ok(newUser);
    }
    @GetMapping("users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody UserDto userDto){

        User user = userService.updateUserById(id, userDto);


        return ResponseEntity.ok(user);
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<Void> DeleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
