/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.plicod.tickets.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Laurita
 */

@Entity
@Table (name="at_departamento")
public class Departamento {
    
    @EmbeddedId
    DepartamentoPk departamentoPK;
    @Column (name="nombre", nullable=false, length=25)
    @NotNull
    @Size (max=25)
    String nombre;
    @Column (name="telefono", nullable=false, length=25)
    @NotNull
    @Size (max=25)
    String telefono;
    
    public Departamento() {
    }

    public DepartamentoPk getDepartamentoPK() {
        return departamentoPK;
    }

    public void setDepartamentoPK(DepartamentoPk departamentoPK) {
        this.departamentoPK = departamentoPK;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
