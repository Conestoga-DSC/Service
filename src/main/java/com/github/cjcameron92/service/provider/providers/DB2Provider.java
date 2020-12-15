package com.github.cjcameron92.service.provider.providers;

import com.github.cjcameron92.service.provider.JDBCProvider;
import com.github.cjcameron92.service.util.DatabaseCredential;

public class DB2Provider extends JDBCProvider {

    public DB2Provider(DatabaseCredential credential) {
        super(credential);
    }

    @Override
    public String getName() {
        return "DB2Provider";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
