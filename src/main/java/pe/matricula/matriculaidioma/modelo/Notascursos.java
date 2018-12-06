/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "notascursos")
@NamedQueries({
    @NamedQuery(name = "Notascursos.findAll", query = "SELECT n FROM Notascursos n")})
public class Notascursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNcursos")
    private Integer idNcursos;
    @JoinColumn(name = "idDmatricula", referencedColumnName = "idDmatricula")
    @ManyToOne(optional = false)
    private Detallematricula idDmatricula;

    public Notascursos() {
    }

    public Notascursos(Integer idNcursos) {
        this.idNcursos = idNcursos;
    }

    public Integer getIdNcursos() {
        return idNcursos;
    }

    public void setIdNcursos(Integer idNcursos) {
        this.idNcursos = idNcursos;
    }

    public Detallematricula getIdDmatricula() {
        return idDmatricula;
    }

    public void setIdDmatricula(Detallematricula idDmatricula) {
        this.idDmatricula = idDmatricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNcursos != null ? idNcursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notascursos)) {
            return false;
        }
        Notascursos other = (Notascursos) object;
        if ((this.idNcursos == null && other.idNcursos != null) || (this.idNcursos != null && !this.idNcursos.equals(other.idNcursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Notascursos[ idNcursos=" + idNcursos + " ]";
    }
    
}
