package ho.pte.pteprogmoditalbolt.service;

import ho.pte.pteprogmoditalbolt.dto.UserDto;
import ho.pte.pteprogmoditalbolt.modell.User;
import ho.pte.pteprogmoditalbolt.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public User createUser(UserDto user) {
        User newUser = User.builder().name(user.getName()).email(user.getEmail()).phoneNumber(user.getPhoneNumber()).zip(user.getZip()).city(user.getCity()).street(user.getStreet()).cart(user.getCart()).build();
        userRepository.save(newUser);
        return newUser;
    }
}
