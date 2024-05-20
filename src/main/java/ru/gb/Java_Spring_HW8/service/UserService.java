package ru.gb.Java_Spring_HW8.service;

import ru.gb.Java_Spring_HW8.aspect.TrackUserAction;
import ru.gb.Java_Spring_HW8.domen.User;
import ru.gb.Java_Spring_HW8.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @TrackUserAction
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @TrackUserAction
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id){
        userRepository.deleteById(id);
    }

    @TrackUserAction
    public User getOne(int id){
        System.out.println("User service get id: "+id);
        return userRepository.getOne(id);
    }

    public User updateUser(User user){
        return userRepository.update(user);
    }
}
