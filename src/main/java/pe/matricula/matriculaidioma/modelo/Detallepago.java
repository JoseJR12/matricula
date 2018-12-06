/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "detallepago")
@NamedQueries({
    @NamedQuery(name = "Detallepago.findAll", query = "SELECT d FROM Detallepago d")})
public class Detallepago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPago")
    private Integer idPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_total")
    private BigInteger pagoTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "descuentos")
    private String descuentos;
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    @ManyToOne(optional = false)
    private DocumentoPago idFactura;
    @JoinColumn(name = "idMatricula", referencedColumnName = "idMatricula")
    @ManyToOne(optional = false)
    private Matricula idMatricula;

    public Detallepago() {
    }

    public Detallepago(Integer idPago) {
        this.idPago = idPago;
    }

    public Detallepago(Integer idPago, BigInteger pagoTotal, String descuentos) {
        this.idPago = idPago;
        this.pagoTotal = pagoTotal;
        this.descuentos = descuentos;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public BigInteger getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(BigInteger pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public DocumentoPago getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(DocumentoPago idFactura) {
        this.idFactura = idFactura;
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
        hash += (idPago != null ? idPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallepago)) {
            return false;
        }
        Detallepago other = (Detallepago) object;
        if ((this.idPago == null && other.idPago != null) || (this.idPago != null && !this.idPago.equals(other.idPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.matricula.matriculaidioma.modelo.Detallepago[ idPago=" + idPago + " ]";
    }
    
}
