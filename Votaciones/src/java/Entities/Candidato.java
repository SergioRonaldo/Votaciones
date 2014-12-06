/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Formula Vol II
 */
@Entity
public class Candidato extends Estudiantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "votos")
    private Integer votos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroTar")
    private Integer numeroTar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private String tipo;

    public Candidato() {
    }

    public Candidato(Integer votos, Integer numeroTar, String tipo, Integer id) {
        super(id);
        this.votos = votos;
        this.numeroTar = numeroTar;
        this.tipo = tipo;
    }





    
    
    
    
    
    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public Integer getNumeroTar() {
        return numeroTar;
    }

    public void setNumeroTar(Integer numeroTar) {
        this.numeroTar = numeroTar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    



    @Override
    public String toString() {
        return "Entities.Candidato[ id=" + id + " ]";
    }
    
}
