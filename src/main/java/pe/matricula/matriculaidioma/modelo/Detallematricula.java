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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "detallematricula")
@NamedQueries({
    @NamedQuery(name = "Detallematricula.findAll", query = "SELECT d FROM Detallematricula d")})
public class Detallematricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDmatricula")
    private Integer idDmatricula;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDmatricula")
    private Collection<Notascursos> notascursosCollection;
    @JoinColumn(name = "idCursosDictados", referencedColumnName = "idCursosDictados")
    @ManyToOne(optional = false)
    private CursosAperturados idCursosDictados;
    @JoinColumn(name = "idMatricula", referencedColumnName = "idMatricula")
    @ManyToOne(optional = false)
    private Matricula idMatricula;

    public Detallematricula() {
    }

    public Detallematricula(Integer idDmatricula) {
        this.idDmatricula = idDmatricula;
    }

    public Integer getIdDmatricula() {
        return idDmatricula;
    }

    public void setIdDmatricula(Integer idDmatricula) {
        this.idDmatricula = idDmatricula;
    }

    public Collection<Notascursos> getNotascursosCollection() {
        return notascursosCollection;
    }

    public void setNotascursosCollection(Collection<Notascursos> notascursosCollection) {
        this.notascursosCollection = notascursosCollection;
    }

    public CursosAperturados getIdCursosDictados() {
        return idCursosDictados;
    }

    public void setIdCursosDictados(CursosAperturados idCursosDictados) {
        this.idCursosDictados = idCursosDictados;
    }

    public Matricula getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Matricula idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDmatricula != null ? idDmatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallematricula)) {
            return false;
        }
        Detallematricula other = (Detallematricula) object;
        if ((this.idDmatricula == null && other.idDmatricula != null) || (this.idDmatricula != null && !this.idDmatricula.equals(other.idDmatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Detallematricula[ idDmatricula=" + idDmatricula + " ]";
    }
    
}
