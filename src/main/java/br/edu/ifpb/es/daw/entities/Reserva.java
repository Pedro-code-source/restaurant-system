package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Reserva {

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float valorDaReserva;

    private Date dataEHora;

    public Reserva(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorDaReserva() {
        return valorDaReserva;
    }

    public void setValorDaReserva(float valorDaReserva) {
        this.valorDaReserva = valorDaReserva;
    }

    public Date getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(Date dataEHora) {
        this.dataEHora = dataEHora;
    }
    public void setMesa(Mesa mesa){
        this.mesa = mesa;


    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id && Float.compare(valorDaReserva, reserva.valorDaReserva) == 0 && Objects.equals(dataEHora, reserva.dataEHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valorDaReserva, dataEHora);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", valorDaReserva=" + valorDaReserva +
                ", dataEHora=" + dataEHora +
                '}';
    }
}