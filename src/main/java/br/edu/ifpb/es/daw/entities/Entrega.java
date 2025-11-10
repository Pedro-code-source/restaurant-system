package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Entrega {

    @OneToOne(mappedBy = "entrega")
    private PedidoOnline pedidoOnline;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomeEntregador;

    private int telefoneEntregador;

    public Entrega(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public int getTelefoneEntregador() {
        return telefoneEntregador;
    }

    public void setTelefoneEntregador(int telefoneEntregador) {
        this.telefoneEntregador = telefoneEntregador;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entrega entrega = (Entrega) o;
        return id == entrega.id && telefoneEntregador == entrega.telefoneEntregador && Objects.equals(nomeEntregador, entrega.nomeEntregador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeEntregador, telefoneEntregador);
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "id=" + id +
                ", nome='" + nomeEntregador + '\'' +
                ", telefone=" + telefoneEntregador +
                '}';
    }
}