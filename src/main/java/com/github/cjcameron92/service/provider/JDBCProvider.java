package com.github.cjcameron92.service.provider;

import com.github.cjcameron92.service.util.DatabaseCredential;

import java.sql.Connection;

public abstract class JDBCProvider implements RemoteProvider {

    private Connection connection;

    public JDBCProvider(DatabaseCredential credential) {
        try {
            Class.forName(credential.getDriver());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
