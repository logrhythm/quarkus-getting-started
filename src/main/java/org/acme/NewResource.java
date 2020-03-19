package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class NewResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String demo() {
        String greetings = findGreetings();
        return greetings;
    }

    private String findGreetings() {
        String greetings = "Hello Quarkus";
        return greetings.toUpperCase();
    }
}