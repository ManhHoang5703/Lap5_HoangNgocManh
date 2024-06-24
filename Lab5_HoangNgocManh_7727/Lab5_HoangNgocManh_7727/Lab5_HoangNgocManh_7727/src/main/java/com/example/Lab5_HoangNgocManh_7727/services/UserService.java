package com.example.Lab5_HoangNgocManh_7727.services;
import com.example.Lab5_HoangNgocManh_7727.entity.User;
import com.example.Lab5_HoangNgocManh_7727.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}
