/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.plicod.tickets;

import gt.com.plicod.tickets.model.AtTecnico;
import gt.com.plicod.tickets.model.AtTicket;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Laurita
 */
public class PruebaTickets {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketsPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        AtTicket ticket = new AtTicket("Navegacion", "No puedo ingresar a pagina de Banguat", "C", new Date());
        em.persist(ticket);
        tx.commit();
        
        AtTecnico tecnico = new AtTecnico("Jose Cordova", "jose@correo.com");
        em.persist(tecnico);
        ticket.setTecnico(tecnico);
        ticket.setEstado("A");

        em.remove(ticket);
        
        System.out.println("Transaccion ejecutada");
        em.close();
        emf.close();
    }
    
}
