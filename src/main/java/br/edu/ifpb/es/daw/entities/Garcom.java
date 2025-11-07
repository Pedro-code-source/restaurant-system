package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Garcom extends Usuario {

    private String nome;

    public Garcom(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garcom garcom = (Garcom) o;
        return getId() == garcom.getId() && Objects.equals(nome, garcom.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), nome);
    }

    @Override
    public String toString() {
        return "Garcom{" +
                "id=" + getId() + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}