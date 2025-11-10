package br.edu.ifpb.es.daw.atividade1.mains.save;

import br.edu.ifpb.es.daw.entities.Reserva;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class MainReservaSave {
    public static void main(String[] args) {

        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();

            Reserva reserva = new Reserva();
            reserva.setValorDaReserva(20);
            reserva.setDataEHora(new Date());
            em.persist(reserva);
            em.getTransaction().commit();
        }
    }
}