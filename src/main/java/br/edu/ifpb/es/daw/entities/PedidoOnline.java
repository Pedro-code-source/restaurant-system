package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_PEDIDO_ONLINE")
public class PedidoOnline extends Pedido{

    @ManyToOne
    @JoinColumn(name = "id_entrega")
    private Entrega entregas;

    public PedidoOnline() {

    }

    public void setEntregas(Entrega entregas) {
        this.entregas = entregas;
    }

    public Entrega getEntregas() {
        return entregas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PedidoOnline that = (PedidoOnline) o;
        return getId() == that.getId() && Float.compare(getValorFinal(), that.getValorFinal()) == 0 && Objects.equals(getStatus(), that.getStatus()) && Objects.equals(getFormaDePagamento(), that.getFormaDePagamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValorFinal(), getStatus(), getFormaDePagamento());
    }

    @Override
    public String toString() {
        return "PedidoOnline{" +
                "id=" + getId() +
                ", valorFinal=" + getValorFinal() +
                ", status='" + getStatus() + '\'' +
                ", formaDePagamento='" + getFormaDePagamento() + '\'' +
                '}';
    }
}