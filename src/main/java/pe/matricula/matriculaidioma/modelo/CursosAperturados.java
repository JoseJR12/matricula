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
@Table(name = "cursos_aperturados")
@NamedQueries({
    @NamedQuery(name = "CursosAperturados.findAll", query = "SELECT c FROM CursosAperturados c")})
public class CursosAperturados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCursosDictados")
    private Integer idCursosDictados;
    @JoinColumn(name = "idAula", referencedColumnName = "idAula")
    @ManyToOne(optional = false)
    private Aula idAula;
    @JoinColumn(name = "idCargaPlaAperturado", referencedColumnName = "idCargaPlaAperturado")
    @ManyToOne(optional = false)
    private CargaplanAperturado idCargaPlaAperturado;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false)
    private Curso idCurso;
    @JoinColumn(name = "idDocente", referencedColumnName = "idDocente")
    @ManyToOne(optional = false)
    private Docente idDocente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCursosDictados")
    private Collection<Detallematricula> detallematriculaCollection;

    public CursosAperturados() {
    }

    public CursosAperturados(Integer idCursosDictados) {
        this.idCursosDictados = idCursosDictados;
    }

    public Integer getIdCursosDictados() {
        return idCursosDictados;
    }

    public void setIdCursosDictados(Integer idCursosDictados) {
        this.idCursosDictados = idCursosDictados;
    }

    public Aula getIdAula() {
        return idAula;
    }

    public void setIdAula(Aula idAula) {
        this.idAula = idAula;
    }

    public CargaplanAperturado getIdCargaPlaAperturado() {
        return idCargaPlaAperturado;
    }

    public void setIdCargaPlaAperturado(CargaplanAperturado idCargaPlaAperturado) {
        this.idCargaPlaAperturado = idCargaPlaAperturado;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    public Collection<Detallematricula> getDetallematriculaCollection() {
        return detallematriculaCollection;
    }

    public void setDetallematriculaCollection(Collection<Detallematricula> detallematriculaCollection) {
        this.detallematriculaCollection = detallematriculaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCursosDictados != null ? idCursosDictados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursosAperturados)) {
            return false;
        }
        CursosAperturados other = (CursosAperturados) object;
        if ((this.idCursosDictados == null && other.idCursosDictados != null) || (this.idCursosDictados != null && !this.idCursosDictados.equals(other.idCursosDictados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.CursosAperturados[ idCursosDictados=" + idCursosDictados + " ]";
    }
    
}
