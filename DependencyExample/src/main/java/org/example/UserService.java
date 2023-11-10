package org.example;

import javax.inject.Inject;


// This UserService class is a CDI Bean
public class UserService {

    @Inject
    private UserRepo userRepo;
    @Inject
    private PasswordEncryption encryption;

    public User saveUser(User u) {
        u.setPassword(encryption.encrypt(u.getPassword()));
        return userRepo.save(u);
    }
}
