package com.gestor.rh.microservices.user.services;

import com.gestor.rh.microservices.user.resources.UserResource;

public interface UserService {
    void saveUser(UserResource userResource);
    UserResource findById(Long id);
}
