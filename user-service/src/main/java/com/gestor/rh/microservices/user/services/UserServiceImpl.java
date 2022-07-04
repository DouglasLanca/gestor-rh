package com.gestor.rh.microservices.user.services;

import com.gestor.rh.microservices.user.domain.User;
import com.gestor.rh.microservices.user.mappers.UserMapper;
import com.gestor.rh.microservices.user.repository.UserRepository;
import com.gestor.rh.microservices.user.resources.UserResource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserResource userResource){
        User user = UserMapper.mapResourceToDomain(userResource);
        userRepository.save(user);
    }

    @Override
    public UserResource findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()){
            return null;
        }
        return UserMapper.mapDomainToResource(user.get());
    }
}
