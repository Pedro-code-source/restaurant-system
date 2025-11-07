package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Ingredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private int quantidade;

    private String unidadeDeMedida;

    public Ingredientes(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ingredientes that = (Ingredientes) o;
        return id == that.id && quantidade == that.quantidade && Objects.equals(nome, that.nome) && Objects.equals(unidadeDeMedida, that.unidadeDeMedida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, quantidade, unidadeDeMedida);
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", unidadeDeMedida='" + unidadeDeMedida + '\'' +
                '}';
    }
}