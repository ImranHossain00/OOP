package org.example;

import javax.inject.Inject;


// This UserService class is a CDI Bean
public class UserService {

    @Inject
    @Remote
    private UserRepo userRepo;
    @Inject
    @Sha225
    private PasswordEncryption encryption;

    public User saveUser(User u) {
        u.setPassword(encryption.encrypt(u.getPassword()));
        return userRepo.save(u);
    }
}
