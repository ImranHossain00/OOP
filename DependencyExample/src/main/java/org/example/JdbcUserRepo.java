package org.example;

import javax.enterprise.inject.Default;
import java.util.ArrayList;
import java.util.List;

@Default
public class JdbcUserRepo implements UserRepo{

    private static final List<User> USERS
            = new ArrayList<>();

    @Override
    public User save(User u) {
        USERS.add(u);
        return u;
    }
}
