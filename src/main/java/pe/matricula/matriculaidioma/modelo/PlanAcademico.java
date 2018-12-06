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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "plan_academico")
@NamedQueries({
    @NamedQuery(name = "PlanAcademico.findAll", query = "SELECT p FROM PlanAcademico p")})
public class PlanAcademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlan")
    private Integer idPlan;
    @Size(max = 10)
    @Column(name = "nombre_plan")
    private String nombrePlan;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_escuela")
    private String idEscuela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan")
    private Collection<Planestudiante> planestudianteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan")
    private Collection<Silabo> silaboCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan")
    private Collection<Curso> cursoCollection;
    @JoinColumn(name = "idFacultad", referencedColumnName = "idFacultad")
    @ManyToOne(optional = false)
    private Facultad idFacultad;

    public PlanAcademico() {
    }

    public PlanAcademico(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public PlanAcademico(Integer idPlan, String idEscuela) {
        this.idPlan = idPlan;
        this.idEscuela = idEscuela;
    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(String idEscuela) {
        this.idEscuela = idEscuela;
    }

    public Collection<Planestudiante> getPlanestudianteCollection() {
        return planestudianteCollection;
    }

    public void setPlanestudianteCollection(Collection<Planestudiante> planestudianteCollection) {
        this.planestudianteCollection = planestudianteCollection;
    }

    public Collection<Silabo> getSilaboCollection() {
        return silaboCollection;
    }

    public void setSilaboCollection(Collection<Silabo> silaboCollection) {
        this.silaboCollection = silaboCollection;
    }

    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    public Facultad getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Facultad idFacultad) {
        this.idFacultad = idFacultad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanAcademico)) {
            return false;
        }
        PlanAcademico other = (PlanAcademico) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.PlanAcademico[ idPlan=" + idPlan + " ]";
    }
    
}
