/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaborModel;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Santiago
 */
@Entity
@Table(name = "materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m")
    , @NamedQuery(name = "Materia.findByCode", query = "SELECT m FROM Materia m WHERE m.code = :code")
    , @NamedQuery(name = "Materia.findByName", query = "SELECT m FROM Materia m WHERE m.name = :name")
    , @NamedQuery(name = "Materia.findByCredits", query = "SELECT m FROM Materia m WHERE m.credits = :credits")
    , @NamedQuery(name = "Materia.findByHorary", query = "SELECT m FROM Materia m WHERE m.horary = :horary")
    , @NamedQuery(name = "Materia.findByCapacity", query = "SELECT m FROM Materia m WHERE m.capacity = :capacity")})
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "code")
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credits")
    private short credits;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "horary")
    private String horary;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacity")
    private short capacity;

    public Materia() {
    }

    public Materia(Integer code) {
        this.code = code;
    }

    public Materia(Integer code, String name, short credits, String horary, short capacity) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.horary = horary;
        this.capacity = capacity;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCredits() {
        return credits;
    }

    public void setCredits(short credits) {
        this.credits = credits;
    }

    public String getHorary() {
        return horary;
    }

    public void setHorary(String horary) {
        this.horary = horary;
    }

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LaborModel.Materia[ code=" + code + " ]";
    }
    
}
