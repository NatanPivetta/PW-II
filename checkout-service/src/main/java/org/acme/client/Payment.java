package org.acme.client;
import org.acme.model.Invoice;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8081/payment")

public interface Payment {
    @POST
    @Path("/pay")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)

    
    Invoice pay(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value);


}
