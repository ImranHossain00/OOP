package org.example;

import javax.enterprise.inject.Default;

@Default
public class MD5PasswordEncryption implements PasswordEncryption{
    @Override
    public String encrypt(String pass) {
        return null;
    }
}
