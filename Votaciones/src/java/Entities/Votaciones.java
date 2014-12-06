/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Formula Vol II
 */
@Entity
@Table(name = "votaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Votaciones.findAll", query = "SELECT v FROM Votaciones v"),
    @NamedQuery(name = "Votaciones.findByIdVotaciones", query = "SELECT v FROM Votaciones v WHERE v.idVotaciones = :idVotaciones"),
    @NamedQuery(name = "Votaciones.findByGrado", query = "SELECT v FROM Votaciones v WHERE v.grado = :grado"),
    @NamedQuery(name = "Votaciones.findByEstado", query = "SELECT v FROM Votaciones v WHERE v.estado = :estado"),
    @NamedQuery(name = "Votaciones.findByVotantes", query = "SELECT v FROM Votaciones v WHERE v.votantes = :votantes"),
    @NamedQuery(name = "Votaciones.findByNombre", query = "SELECT v FROM Votaciones v WHERE v.nombre = :nombre")})
public class Votaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVotaciones")
    private Integer idVotaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "grado")
    private String grado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "votantes")
    private int votantes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "usuario",cascade= CascadeType.ALL)
    private List<Usuario> usuario;
    @OneToMany(mappedBy = "candidato",cascade= CascadeType.ALL)
    private List<Candidato> candidato;
    public Votaciones() {
    }

    public Votaciones(Integer idVotaciones) {
        this.idVotaciones = idVotaciones;
    }

    public Votaciones(Integer idVotaciones, String grado, boolean estado, int votantes, String nombre, List<Usuario> usuario, List<Candidato> candidato) {
        this.idVotaciones = idVotaciones;
        this.grado = grado;
        this.estado = estado;
        this.votantes = votantes;
        this.nombre = nombre;
        this.usuario = usuario;
        this.candidato = candidato;
    }
    
    
    

    public Integer getIdVotaciones() {
        return idVotaciones;
    }

    public void setIdVotaciones(Integer idVotaciones) {
        this.idVotaciones = idVotaciones;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVotantes() {
        return votantes;
    }

    public void setVotantes(int votantes) {
        this.votantes = votantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public void setCandidato(List<Candidato> candidato) {
        this.candidato = candidato;
    }

  



    @Override
    public String toString() {
        return "Entities.Votaciones[ idVotaciones=" + idVotaciones + " ]";
    }
    
}
