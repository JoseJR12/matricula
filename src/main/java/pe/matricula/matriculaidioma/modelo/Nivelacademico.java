/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "nivelacademico")
@NamedQueries({
    @NamedQuery(name = "Nivelacademico.findAll", query = "SELECT n FROM Nivelacademico n")})
public class Nivelacademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNivelAcademico")
    private Integer idNivelAcademico;
    @Size(max = 30)
    @Column(name = "nivel")
    private String nivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNivelAcademico")
    private Collection<Curso> cursoCollection;

    public Nivelacademico() {
    }

    public Nivelacademico(Integer idNivelAcademico) {
        this.idNivelAcademico = idNivelAcademico;
    }

    public Integer getIdNivelAcademico() {
        return idNivelAcademico;
    }

    public void setIdNivelAcademico(Integer idNivelAcademico) {
        this.idNivelAcademico = idNivelAcademico;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelAcademico != null ? idNivelAcademico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivelacademico)) {
            return false;
        }
        Nivelacademico other = (Nivelacademico) object;
        if ((this.idNivelAcademico == null && other.idNivelAcademico != null) || (this.idNivelAcademico != null && !this.idNivelAcademico.equals(other.idNivelAcademico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Nivelacademico[ idNivelAcademico=" + idNivelAcademico + " ]";
    }
    
}
