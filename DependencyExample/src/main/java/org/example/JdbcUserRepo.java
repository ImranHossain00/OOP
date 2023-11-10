package org.example;

import java.util.ArrayList;
import java.util.List;

public class JdbcUserRepo implements UserRepo{

    private static final List<User> USERS
            = new ArrayList<>();

    @Override
    public User save(User u) {
        USERS.add(u);
        return u;
    }
}
