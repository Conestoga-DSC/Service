package com.github.cjcameron92.service;

import com.github.cjcameron92.service.provider.Provider;
import com.github.cjcameron92.service.provider.RemoteProvider;

import java.util.List;

public interface Service {

    Provider register(Provider provider);

    RemoteProvider register(RemoteProvider remoteProvider);

    List<Provider> getAll();
}
