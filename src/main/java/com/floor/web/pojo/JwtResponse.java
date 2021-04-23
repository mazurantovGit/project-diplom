package com.floor.web.pojo;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class JwtResponse {

    private String token;

    private String type = "Bearer";

    private UUID id;

    private String username;

    private String email;

    private List<String> roles;

    public JwtResponse(String token, UUID id, String username, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

}
