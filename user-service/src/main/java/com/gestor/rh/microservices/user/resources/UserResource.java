package com.gestor.rh.microservices.user.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResource implements Serializable {
    private String name;
    private String document;
    private String status;
}
