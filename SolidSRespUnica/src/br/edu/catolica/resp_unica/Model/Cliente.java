package br.edu.catolica.resp_unica.Model;
import java.util.UUID;

public abstract class Cliente {
    public UUID id;
    public Endereco endereco;
    public Contato contato;
    public boolean clienteAtivo;

    public Cliente(Endereco endereco, Contato contato) {
        this.id = UUID.randomUUID();
        this.endereco = endereco;
        this.contato = contato;
        this.clienteAtivo = true;
    }
}
