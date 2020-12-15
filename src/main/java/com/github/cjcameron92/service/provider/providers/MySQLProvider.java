package com.github.cjcameron92.service.provider.providers;

import com.github.cjcameron92.service.provider.JDBCProvider;
import com.github.cjcameron92.service.util.DatabaseCredential;

public class MySQLProvider extends JDBCProvider {

    public MySQLProvider(DatabaseCredential credential) {
        super(credential);
    }

    @Override
    public String getName() {
        return "MySQLProvider";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
