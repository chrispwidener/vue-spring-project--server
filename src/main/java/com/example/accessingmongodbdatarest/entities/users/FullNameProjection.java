package com.example.accessingmongodbdatarest.entities.users;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullName", types = { User.class })
public interface FullNameProjection {
    String getFullName();
}
