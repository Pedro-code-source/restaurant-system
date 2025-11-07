package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

public class PedidoOnline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float valorFinal;

    private String status;

    private String formaDePagamento;

    public PedidoOnline() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PedidoOnline that = (PedidoOnline) o;
        return id == that.id && Float.compare(valorFinal, that.valorFinal) == 0 && Objects.equals(status, that.status) && Objects.equals(formaDePagamento, that.formaDePagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valorFinal, status, formaDePagamento);
    }

    @Override
    public String toString() {
        return "PedidoOnline{" +
                "id=" + id +
                ", valorFinal=" + valorFinal +
                ", status='" + status + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                '}';
    }
}
