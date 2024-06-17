package com.example.Lab5_HoangNgocManh_7727.services;
import com.example.Lab5_HoangNgocManh_7727.entity.User;
import com.example.Lab5_HoangNgocManh_7727.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Lab5_HoangNgocManh_7727.repository.IRoleRepository;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId != 0 && userId !=0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
