# Quarkus Reproducer

This shows an issue with smallrye.config.locations in combination with @StaticInitSafe.

To demonstrate the problem do the following:

```
$ ./mvnw clean verify
$ SMALLRYE_CONFIG_LOCATIONS=$(pwd)/external java -jar target/quarkus-app/quarkus-run.jar
```

Quarkus will fail to start with the notification 

```text
java.util.NoSuchElementException: SRCFG00014: The config property foo.bar is required but it could not be found in any config source
```

If you then comment the `@StaticInitSafe` annotation on the `AppConfig` class and again do

```
$ ./mvnw clean verify
$ SMALLRYE_CONFIG_LOCATIONS=$(pwd)/external java -jar target/quarkus-app/quarkus-run.jar
```

Quarkus will start fine.