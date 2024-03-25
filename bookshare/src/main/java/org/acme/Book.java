package main.java.org.acme;

public class Book {
    private String nome;
    private boolean status;

    public Book(String nome, boolean status) {
        this.nome = nome;
        this.status = status;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    


    
}
