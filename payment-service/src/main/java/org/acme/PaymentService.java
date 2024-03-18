package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.Invoice;


import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentService {

    @POST
    @Path("/pay")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)

    public Invoice pay(    
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value) {
        
            Invoice invoice = new Invoice();
            invoice.setCardNumber(cardNumber);
            invoice.setValue(value);
            invoice.setPaid(false);
            System.out.println("Retornando para o Checkout\n");
            return invoice;
    }
}
