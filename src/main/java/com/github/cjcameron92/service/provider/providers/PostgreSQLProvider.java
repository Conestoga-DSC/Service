package com.github.cjcameron92.service.provider.providers;

import com.github.cjcameron92.service.provider.RemoteProvider;

public class PostgreSQLProvider implements RemoteProvider {

    @Override
    public String getName() {
        return "PostgreSQLProvider";
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
