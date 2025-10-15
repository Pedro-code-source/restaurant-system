package saves;

import util.EMF;
import entities.Reserva;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class MainReservaSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();

            Reserva reserva = new Reserva();
            reserva.setValorDaReserva(20);
            reserva.setDataEHora(new Date());
            em.persist(reserva);
            em.getTransaction().commit();
        }
    }
}
