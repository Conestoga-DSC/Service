package com.github.cjcameron92.service.provider;

import com.github.cjcameron92.service.util.DatabaseCredential;

public abstract class NoSQLProvider implements RemoteProvider{

    private DatabaseCredential credential;

    public NoSQLProvider(DatabaseCredential credential) {
        this.credential = credential;
    }


}
