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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "accesos")
@NamedQueries({
    @NamedQuery(name = "Accesos.findAll", query = "SELECT a FROM Accesos a")})
public class Accesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacceso")
    private Integer idacceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombreacceso")
    private String nombreacceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "url")
    private String url;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacceso")
    private Collection<UsuarioAccesos> usuarioAccesosCollection;

    public Accesos() {
    }

    public Accesos(Integer idacceso) {
        this.idacceso = idacceso;
    }

    public Accesos(Integer idacceso, String nombreacceso, String url) {
        this.idacceso = idacceso;
        this.nombreacceso = nombreacceso;
        this.url = url;
    }

    public Integer getIdacceso() {
        return idacceso;
    }

    public void setIdacceso(Integer idacceso) {
        this.idacceso = idacceso;
    }

    public String getNombreacceso() {
        return nombreacceso;
    }

    public void setNombreacceso(String nombreacceso) {
        this.nombreacceso = nombreacceso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Collection<UsuarioAccesos> getUsuarioAccesosCollection() {
        return usuarioAccesosCollection;
    }

    public void setUsuarioAccesosCollection(Collection<UsuarioAccesos> usuarioAccesosCollection) {
        this.usuarioAccesosCollection = usuarioAccesosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacceso != null ? idacceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accesos)) {
            return false;
        }
        Accesos other = (Accesos) object;
        if ((this.idacceso == null && other.idacceso != null) || (this.idacceso != null && !this.idacceso.equals(other.idacceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Accesos[ idacceso=" + idacceso + " ]";
    }
    
}
