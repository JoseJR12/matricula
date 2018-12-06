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
@Table(name = "cargaplan_aperturado")
@NamedQueries({
    @NamedQuery(name = "CargaplanAperturado.findAll", query = "SELECT c FROM CargaplanAperturado c")})
public class CargaplanAperturado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCargaPlaAperturado")
    private Integer idCargaPlaAperturado;
    @JoinColumn(name = "idPeriodo", referencedColumnName = "idPeriodo")
    @ManyToOne(optional = false)
    private Periodo idPeriodo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargaPlaAperturado")
    private Collection<CursosAperturados> cursosAperturadosCollection;

    public CargaplanAperturado() {
    }

    public CargaplanAperturado(Integer idCargaPlaAperturado) {
        this.idCargaPlaAperturado = idCargaPlaAperturado;
    }

    public Integer getIdCargaPlaAperturado() {
        return idCargaPlaAperturado;
    }

    public void setIdCargaPlaAperturado(Integer idCargaPlaAperturado) {
        this.idCargaPlaAperturado = idCargaPlaAperturado;
    }

    public Periodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Periodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Collection<CursosAperturados> getCursosAperturadosCollection() {
        return cursosAperturadosCollection;
    }

    public void setCursosAperturadosCollection(Collection<CursosAperturados> cursosAperturadosCollection) {
        this.cursosAperturadosCollection = cursosAperturadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaPlaAperturado != null ? idCargaPlaAperturado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaplanAperturado)) {
            return false;
        }
        CargaplanAperturado other = (CargaplanAperturado) object;
        if ((this.idCargaPlaAperturado == null && other.idCargaPlaAperturado != null) || (this.idCargaPlaAperturado != null && !this.idCargaPlaAperturado.equals(other.idCargaPlaAperturado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.CargaplanAperturado[ idCargaPlaAperturado=" + idCargaPlaAperturado + " ]";
    }
    
}
