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
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "usuario_accesos")
@NamedQueries({
    @NamedQuery(name = "UsuarioAccesos.findAll", query = "SELECT u FROM UsuarioAccesos u")})
public class UsuarioAccesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usuarioAcceso")
    private Integer usuarioAcceso;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idacceso", referencedColumnName = "idacceso")
    @ManyToOne(optional = false)
    private Accesos idacceso;
    @JoinColumn(name = "idLogin", referencedColumnName = "idLogin")
    @ManyToOne(optional = false)
    private Login idLogin;

    public UsuarioAccesos() {
    }

    public UsuarioAccesos(Integer usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }

    public Integer getUsuarioAcceso() {
        return usuarioAcceso;
    }

    public void setUsuarioAcceso(Integer usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Accesos getIdacceso() {
        return idacceso;
    }

    public void setIdacceso(Accesos idacceso) {
        this.idacceso = idacceso;
    }

    public Login getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Login idLogin) {
        this.idLogin = idLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioAcceso != null ? usuarioAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioAccesos)) {
            return false;
        }
        UsuarioAccesos other = (UsuarioAccesos) object;
        if ((this.usuarioAcceso == null && other.usuarioAcceso != null) || (this.usuarioAcceso != null && !this.usuarioAcceso.equals(other.usuarioAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.UsuarioAccesos[ usuarioAcceso=" + usuarioAcceso + " ]";
    }
    
}
