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
@Table(name = "curso")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCurso")
    private Integer idCurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Hpracticas")
    private String hpracticas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Hteoricas")
    private String hteoricas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "creditos")
    private String creditos;
    @Size(max = 10)
    @Column(name = "turno")
    private String turno;
    @JoinColumn(name = "idNivelAcademico", referencedColumnName = "idNivelAcademico")
    @ManyToOne(optional = false)
    private Nivelacademico idNivelAcademico;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false)
    private PlanAcademico idPlan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso")
    private Collection<CursosAperturados> cursosAperturadosCollection;

    public Curso() {
    }

    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(Integer idCurso, String hpracticas, String hteoricas, String creditos) {
        this.idCurso = idCurso;
        this.hpracticas = hpracticas;
        this.hteoricas = hteoricas;
        this.creditos = creditos;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getHpracticas() {
        return hpracticas;
    }

    public void setHpracticas(String hpracticas) {
        this.hpracticas = hpracticas;
    }

    public String getHteoricas() {
        return hteoricas;
    }

    public void setHteoricas(String hteoricas) {
        this.hteoricas = hteoricas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Nivelacademico getIdNivelAcademico() {
        return idNivelAcademico;
    }

    public void setIdNivelAcademico(Nivelacademico idNivelAcademico) {
        this.idNivelAcademico = idNivelAcademico;
    }

    public PlanAcademico getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(PlanAcademico idPlan) {
        this.idPlan = idPlan;
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
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Curso[ idCurso=" + idCurso + " ]";
    }
    
}
