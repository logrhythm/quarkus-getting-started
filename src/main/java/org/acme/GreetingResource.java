package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import services.GreetingService;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class GreetingResource {
    
    
    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(@PathParam String name) 
    {
        return service.greeting(name);
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // System.out.println("251dfas7");
        return "hello";
    }
}