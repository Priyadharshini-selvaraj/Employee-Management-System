package com.ems.employee_backend.config;

import com.ems.employee_backend.entity.User;
import com.ems.employee_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        String defaultAdmin = "admin";
        if (userRepository.findByUsername(defaultAdmin).isEmpty()) {
            User u = new User();
            u.setUsername(defaultAdmin);
            u.setPassword(passwordEncoder.encode("Admin@123"));
            u.setRole("ROLE_ADMIN");
            userRepository.save(u);
            log.info("Created default admin user '{}'.", defaultAdmin);
        } else {
            log.info("Default admin user '{}' already exists.", defaultAdmin);
        }
    }
}
