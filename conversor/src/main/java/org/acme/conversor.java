package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import org.acme.Nos;

@Path("/conversor")
public class conversor{

    @POST
    @Path("/km-to-mi")
    @Produces(MediaType.TEXT_PLAIN)
    public String KmToMi(@FormParam ("km") double km) {
        
        return 
        "Km/h: " + km +
        "MPH: " + Double.toString(km * .621371);
    }


    @GET
    @Path("/nos-to-km")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN) 
    public Nos NosToKm(@QueryParam("nos") double nos){

        double km = nos * 1.852;
        Nos result = new Nos(nos, km);

        return result;
    }



}



