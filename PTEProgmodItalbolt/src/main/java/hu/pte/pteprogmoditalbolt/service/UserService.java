package hu.pte.pteprogmoditalbolt.service;

import hu.pte.pteprogmoditalbolt.dto.UserDto;
import hu.pte.pteprogmoditalbolt.modell.User;
import hu.pte.pteprogmoditalbolt.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public User createUser(UserDto user) {
        User newUser = User.builder().name(user.getName()).email(user.getEmail()).phoneNumber(user.getPhoneNumber()).zip(user.getZip()).city(user.getCity()).street(user.getStreet()).build();
        userRepository.save(newUser);
        return newUser;
    }

    public User getUserById(Integer id){
        User user = userRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
        return user;
    }


    public User updateUserById(Integer id, UserDto userDto){

        User user =  userRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());

        user.setName(userDto.getName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setEmail(userDto.getEmail());
        user.setZip(userDto.getZip());
        user.setCity(userDto.getCity());
        user.setStreet(userDto.getStreet());

        userRepository.save(user);

        return user;
    }

    public void deleteUserById(Integer id) {
       userRepository.deleteById(id);
    }
}
