# Service

```java
    public static void main(String[] args) {
        final Service service = new DefaultService();
        final RemoteProvider remoteProvider = service.register(new MongoProvider(
                new DatabaseCredential("https://localhost", 8080, "root", "admin")
        ));

        // open the connection
        remoteProvider.open();
    }
    ```
