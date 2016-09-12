/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.usuario.be;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jim_2
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario.findByClave", query = "SELECT u FROM Usuario u WHERE u.clave = :clave"),
    @NamedQuery(name = "Usuario.findByUsuCreacion", query = "SELECT u FROM Usuario u WHERE u.usuCreacion = :usuCreacion"),
    @NamedQuery(name = "Usuario.findByFecCreacion", query = "SELECT u FROM Usuario u WHERE u.fecCreacion = :fecCreacion"),
    @NamedQuery(name = "Usuario.findByHorCreacion", query = "SELECT u FROM Usuario u WHERE u.horCreacion = :horCreacion"),
    @NamedQuery(name = "Usuario.findByUsuModificacion", query = "SELECT u FROM Usuario u WHERE u.usuModificacion = :usuModificacion"),
    @NamedQuery(name = "Usuario.findByFecModificacion", query = "SELECT u FROM Usuario u WHERE u.fecModificacion = :fecModificacion"),
    @NamedQuery(name = "Usuario.findByHorModificacion", query = "SELECT u FROM Usuario u WHERE u.horModificacion = :horModificacion"),
    @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 20)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 20)
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "USU_CREACION")
    private Long usuCreacion;
    @Column(name = "FEC_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fecCreacion;
    @Size(max = 10)
    @Column(name = "HOR_CREACION")
    private String horCreacion;
    @Column(name = "USU_MODIFICACION")
    private Long usuModificacion;
    @Column(name = "FEC_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fecModificacion;
    @Size(max = 10)
    @Column(name = "HOR_MODIFICACION")
    private String horModificacion;
    @Column(name = "ESTADO")
    private Character estado;

    public Usuario() {
    }

    public Usuario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Long getUsuCreacion() {
        return usuCreacion;
    }

    public void setUsuCreacion(Long usuCreacion) {
        this.usuCreacion = usuCreacion;
    }

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getHorCreacion() {
        return horCreacion;
    }

    public void setHorCreacion(String horCreacion) {
        this.horCreacion = horCreacion;
    }

    public Long getUsuModificacion() {
        return usuModificacion;
    }

    public void setUsuModificacion(Long usuModificacion) {
        this.usuModificacion = usuModificacion;
    }

    public Date getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
    }

    public String getHorModificacion() {
        return horModificacion;
    }

    public void setHorModificacion(String horModificacion) {
        this.horModificacion = horModificacion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.usuario.be.Usuario[ id=" + id + " ]";
    }
    
}
