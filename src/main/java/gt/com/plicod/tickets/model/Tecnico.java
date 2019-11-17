/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.plicod.tickets.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Laurita
 */
@Entity
@Table (name="at_tecnico")
public class Tecnico {
    
    @Id
    @Column (name="tecnico_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long ticketId;
    @Column (name="nombre", nullable=false, length=100)
    @NotNull
    @Size (max=100)
    String nombre;
    @Column (name="email", nullable=false, length=100)
    @NotNull
    @Size (max=100)
    String email;
    @OneToMany (mappedBy="tecnico")
    @JoinColumn (name="tecnico_id")
    List<Ticket> tickets;
    
    public Tecnico() {
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    
}
