package com.brennanmanion.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/resteasy")
public class RestEasyResource {
	
	@Path("/test")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testWS (String message)
	{
		System.out.println("!!!!!!!!");
		System.out.println(message);
		System.out.println("!!!!!!!!");		
		
        return  Response.ok().build();
    }
}
