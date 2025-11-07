package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Cliente extends Usuario {

    private String nome;

    private int telefone;

    private String endereco;

    public Cliente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return getId() == cliente.getId() && telefone == cliente.telefone && Objects.equals(nome, cliente.nome) && Objects.equals(endereco, cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), nome, telefone, endereco);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}