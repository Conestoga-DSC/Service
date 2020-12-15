package com.github.cjcameron92.service.provider.providers;

import com.github.cjcameron92.service.provider.NoSQLProvider;
import com.github.cjcameron92.service.util.DatabaseCredential;

public class RedisProvider extends NoSQLProvider {

    public RedisProvider(DatabaseCredential credential) {
        super(credential);
    }

    @Override
    public String getName() {
        return "RedisProvider";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
