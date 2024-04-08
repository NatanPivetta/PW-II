package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.Generated;


import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.Book;



@Path("/bookshare")
public class BookShare {

    private List<Book> books = new ArrayList<>();


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
   
    public Book add(
    @FormParam("name") String name,
    @FormParam("status") boolean status ){
        Book book = new Book(name, status);
        books.add(book);
        return book;
    }

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> lista(){
      
        return this.books;
    }

}
