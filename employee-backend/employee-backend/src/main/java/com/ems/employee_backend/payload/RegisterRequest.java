package com.ems.employee_backend.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String password;
    private String role; // optional, e.g. ROLE_ADMIN or ROLE_USER
}
