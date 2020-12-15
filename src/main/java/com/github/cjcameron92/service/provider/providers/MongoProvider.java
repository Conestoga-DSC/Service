package com.github.cjcameron92.service.provider.providers;

import com.github.cjcameron92.service.provider.NoSQLProvider;
import com.github.cjcameron92.service.provider.RemoteProvider;
import com.github.cjcameron92.service.util.DatabaseCredential;

public class MongoProvider extends NoSQLProvider {

    public MongoProvider(DatabaseCredential credential) {
        super(credential);
    }

    @Override
    public String getName() {
        return "MongoProvider";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
