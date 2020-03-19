LogRhythm Next Gen POC

Hello World POC including technologies:- Java, Quarkus, Graal VM, Postgres integration & gRPC Call.

# quarkus-getting-started project created by Ankit Jha

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `quarkus-getting-started-1.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-getting-started-1.0-SNAPSHOT-runner.jar`.

