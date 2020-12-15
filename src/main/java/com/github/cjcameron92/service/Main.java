package com.github.cjcameron92.service;

import com.github.cjcameron92.service.provider.RemoteProvider;
import com.github.cjcameron92.service.provider.providers.MongoProvider;
import com.github.cjcameron92.service.util.DatabaseCredential;

public class Main {

    /**
     * TODO:// Modularize the provider system and implement each providers dependencies
     * @param args
     */
    public static void main(String[] args) {
        final Service service = new DefaultService();
        final RemoteProvider remoteProvider = service.register(new MongoProvider(
                new DatabaseCredential("https://localhost", 8080, "root", "admin")
        ));

        // open the connection
        remoteProvider.open();
    }
}
