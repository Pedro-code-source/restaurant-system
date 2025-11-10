package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_PEDIDO_PRESENCIAL")
public class PedidoPresencial extends Pedido{

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_garcom")
    private Garcom garcom;

    public PedidoPresencial(){

    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
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
