package com.github.cjcameron92.service;

import com.github.cjcameron92.service.provider.Provider;
import com.github.cjcameron92.service.provider.RemoteProvider;

import java.util.LinkedList;
import java.util.List;

public class DefaultService implements Service {

    public List<Provider> PROVIDERS = new LinkedList<>();

    @Override
    public Provider register(Provider provider) {
        PROVIDERS.add(provider);
        return provider;
    }

    @Override
    public RemoteProvider register(RemoteProvider remoteProvider) {
        PROVIDERS.add(remoteProvider);
        return remoteProvider;
    }

    public List<Provider> getAll() {
        return PROVIDERS;
    }
}
