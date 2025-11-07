package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class MovimentacaoDeEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date dataCriacao;

    private String tipoDeMovimentacao;

    private int quantidade;

    public MovimentacaoDeEstoque(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTipoDeMovimentacao() {
        return tipoDeMovimentacao;
    }

    public void setTipoDeMovimentacao(String tipoDeMovimentacao) {
        this.tipoDeMovimentacao = tipoDeMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovimentacaoDeEstoque that = (MovimentacaoDeEstoque) o;
        return id == that.id && quantidade == that.quantidade && Objects.equals(dataCriacao, that.dataCriacao) && Objects.equals(tipoDeMovimentacao, that.tipoDeMovimentacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataCriacao, tipoDeMovimentacao, quantidade);
    }

    @Override
    public String toString() {
        return "MovimentacaoDeEstoque{" +
                "id=" + id +
                ", dataCriacao=" + dataCriacao +
                ", tipoDeMovimentacao='" + tipoDeMovimentacao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}