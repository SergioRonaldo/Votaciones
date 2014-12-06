/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Formula Vol II
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Estudiantes  extends  Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "grado")
    private String grado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "jornada")
    private String jornada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "curso")
    private String curso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estado")
    private Boolean estado;

    public Estudiantes() {
    }

    public Estudiantes(String grado, String jornada, String curso, Boolean estado, Integer id, String nombre, String apellido, int edad, String sexo) {
        super(id, nombre, apellido, edad, sexo);
        this.grado = grado;
        this.jornada = jornada;
        this.curso = curso;
        this.estado = estado;
    }

    public Estudiantes(Integer id) {
        super(id);
    }

    
    
    
    
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Entities.Estudiantes[ id=" + id + " ]";
    }
    
}
