package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;
import java.util.Set;

import javax.annotation.processing.Generated;


import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import main.java.org.acme.Book;



@Path("/bookshare")
public class BookShare {

    private Set<Book> books;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @POST
    @Path("/add-book")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void add(Book book){
        books.add(book);
        
    }

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Book> lista(){
        return books;
    }

}
