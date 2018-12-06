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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "silabo")
@NamedQueries({
    @NamedQuery(name = "Silabo.findAll", query = "SELECT s FROM Silabo s")})
public class Silabo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSilabo")
    private Integer idSilabo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sumilla")
    private String sumilla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Unidades")
    private String unidades;
    @JoinColumn(name = "idPlan", referencedColumnName = "idPlan")
    @ManyToOne(optional = false)
    private PlanAcademico idPlan;

    public Silabo() {
    }

    public Silabo(Integer idSilabo) {
        this.idSilabo = idSilabo;
    }

    public Silabo(Integer idSilabo, String sumilla, String unidades) {
        this.idSilabo = idSilabo;
        this.sumilla = sumilla;
        this.unidades = unidades;
    }

    public Integer getIdSilabo() {
        return idSilabo;
    }

    public void setIdSilabo(Integer idSilabo) {
        this.idSilabo = idSilabo;
    }

    public String getSumilla() {
        return sumilla;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
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
        hash += (idSilabo != null ? idSilabo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Silabo)) {
            return false;
        }
        Silabo other = (Silabo) object;
        if ((this.idSilabo == null && other.idSilabo != null) || (this.idSilabo != null && !this.idSilabo.equals(other.idSilabo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Silabo[ idSilabo=" + idSilabo + " ]";
    }
    
}
