/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.plicod.tickets.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Laurita
 */
@Entity
@Table (name="at_ticket")
public class Ticket {

    @Id
    @Column (name="ticket_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long ticketId;
    @Column (name="asunto", nullable=false, length=50)
    @NotNull
    @Size (max=50)
    String asunto;
    @Column (name="descripcion", nullable=false, length=500)
    @NotNull
    @Size (max=500)
    String descripcion;
    @Column (name="estado", nullable=false, length=1)
    @NotNull
    @Size (max=1)
    String estado;
    @Temporal (TemporalType.TIMESTAMP)
    @Column (name="fecha_creacion", nullable=false)
    @NotNull
    Date fechaCreacion;
    @Temporal (TemporalType.TIMESTAMP)
    @Column (name="fecha_solucion")
    Date fechaSolucion;
    @ManyToOne
    @JoinColumn (name="tecnico_id")
    Tecnico tecnico;

    public Ticket() {
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(Date fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
   
}
