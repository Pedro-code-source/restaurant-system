package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float valorFinal;

    private String status;

    private String formaDePagamento;

    public Pedido(){
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id && Float.compare(valorFinal, pedido.valorFinal) == 0 && Objects.equals(status, pedido.status) && Objects.equals(formaDePagamento, pedido.formaDePagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valorFinal, status, formaDePagamento);

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", valorFinal=" + valorFinal +
                ", status='" + status + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                '}';
    }
}
