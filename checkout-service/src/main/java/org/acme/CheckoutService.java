package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;


import org.acme.client.Payment;
import org.acme.model.Invoice;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;


@Path("/checkout")
public class CheckoutService {

    @Inject
    @RestClient
    Payment paymentService;
    
    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Invoice buy(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value) {
            System.out.println("Encaminhando para o Payment\n");
        return paymentService.pay(cardNumber, value);

    }
}
