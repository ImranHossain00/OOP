package org.example;

import java.util.HashSet;
import java.util.Set;

@Remote
public class RemoteUserRepo implements UserRepo{
    private static final Set<User> USERS
            = new HashSet<>();

    @Override
    public User save(User u) {
        USERS.add(u);
        return u;
    }
}
