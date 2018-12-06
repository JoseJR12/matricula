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
@Table(name = "planestudiante")
@NamedQueries({
    @NamedQuery(name = "Planestudiante.findAll", query = "SELECT p FROM Planestudiante p")})
public class Planestudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPestudiante")
    private Integer idPestudiante;
    @JoinColumn(name = "idEstudiante", referencedColumnName = "idEstudiante")
    @ManyToOne(optional = false)
    private Estudiante idEstudiante;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false)
    private PlanAcademico idPlan;

    public Planestudiante() {
    }

    public Planestudiante(Integer idPestudiante) {
        this.idPestudiante = idPestudiante;
    }

    public Integer getIdPestudiante() {
        return idPestudiante;
    }

    public void setIdPestudiante(Integer idPestudiante) {
        this.idPestudiante = idPestudiante;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public PlanAcademico getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(PlanAcademico idPlan) {
        this.idPlan = idPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPestudiante != null ? idPestudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planestudiante)) {
            return false;
        }
        Planestudiante other = (Planestudiante) object;
        if ((this.idPestudiante == null && other.idPestudiante != null) || (this.idPestudiante != null && !this.idPestudiante.equals(other.idPestudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Planestudiante[ idPestudiante=" + idPestudiante + " ]";
    }
    
}
