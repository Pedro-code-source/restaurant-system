package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class PedidoPresencial extends Pedido{

    public PedidoPresencial(){
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PedidoPresencial that = (PedidoPresencial) o;
        return getId() == that.getId() && Float.compare(getValorFinal(), that.getValorFinal()) == 0 && Objects.equals(getStatus(), that.getStatus()) && Objects.equals(getFormaDePagamento(), that.getFormaDePagamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValorFinal(), getStatus(), getFormaDePagamento());
    }

    @Override
    public String toString() {
        return "PedidoPresencial{" +
                "id=" + getId() + '\'' +
                ", valorFinal=" + getValorFinal() +
                ", status='" + getStatus() + '\'' +
                ", formaDePagamento='" + getFormaDePagamento() + '\'' +
                '}';
    }
}
