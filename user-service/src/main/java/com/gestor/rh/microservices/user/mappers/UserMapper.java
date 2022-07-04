package com.gestor.rh.microservices.user.mappers;

import com.gestor.rh.microservices.user.domain.User;
import com.gestor.rh.microservices.user.resources.UserResource;

public class UserMapper {

    public static User mapResourceToDomain(UserResource userResource){
        return User.builder()
                .name(userResource.getName())
                .document(userResource.getDocument())
                .status(userResource.getStatus())
                .build();
    }
}
