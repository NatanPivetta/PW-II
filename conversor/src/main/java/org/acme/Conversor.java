package org.acme;

import org.acme.NosToKm;


import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;


@Path("/conversor")
public class Conversor {

private double quilometrosHora; 
private double milhasHora;



    public double getQuilometrosHora() {
    return quilometrosHora;
}



public void setQuilometrosHora(double quilometrosHora) {
    this.quilometrosHora = quilometrosHora;
}



public double getMilhasHora() {
    return milhasHora;
}



public void setMilhasHora(double milhasHora) {
    this.milhasHora = milhasHora;
}



    @POST
    @Path("/km-milha")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)

    public String converteKmMilha(@FormParam("quilometros") double quilometros) {
        System.out.println("Iniciando Conversão\n");
        this.quilometrosHora = quilometros;
        this.milhasHora = quilometros * 0.621371;
        System.out.println("Conversão Realizada\n");
        System.out.println("Enviando valores\n");
        return quilometros + "Km/h = " + this.milhasHora + " MPH";

    }


    @Inject
    @RestClient
    NosToKm convertNosToKm;

    @GET
    @Path("/nos-km")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String converteNosKm(@FormParam("nos") String nos){

        return convertNosToKm.convert(nos);

   }
}
