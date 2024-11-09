/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouts;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
@Entity
@Table(name = "mata_kuliah")
@NamedQueries({
    @NamedQuery(name = "MataKuliah_1.findAll", query = "SELECT m FROM MataKuliah_1 m"),
    @NamedQuery(name = "MataKuliah_1.findByKodemk", query = "SELECT m FROM MataKuliah_1 m WHERE m.kodemk = :kodemk"),
    @NamedQuery(name = "MataKuliah_1.findBySks", query = "SELECT m FROM MataKuliah_1 m WHERE m.sks = :sks"),
    @NamedQuery(name = "MataKuliah_1.findByNamamk", query = "SELECT m FROM MataKuliah_1 m WHERE m.namamk = :namamk"),
    @NamedQuery(name = "MataKuliah_1.findBySemesterajar", query = "SELECT m FROM MataKuliah_1 m WHERE m.semesterajar = :semesterajar")})
public class MataKuliah_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodemk")
    private String kodemk;
    @Basic(optional = false)
    @Column(name = "sks")
    private int sks;
    @Basic(optional = false)
    @Column(name = "namamk")
    private String namamk;
    @Basic(optional = false)
    @Column(name = "semesterajar")
    private int semesterajar;

    public MataKuliah_1() {
    }

    public MataKuliah_1(String kodemk) {
        this.kodemk = kodemk;
    }

    public MataKuliah_1(String kodemk, int sks, String namamk, int semesterajar) {
        this.kodemk = kodemk;
        this.sks = sks;
        this.namamk = namamk;
        this.semesterajar = semesterajar;
    }

    public String getKodemk() {
        return kodemk;
    }

    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamamk() {
        return namamk;
    }

    public void setNamamk(String namamk) {
        this.namamk = namamk;
    }

    public int getSemesterajar() {
        return semesterajar;
    }

    public void setSemesterajar(int semesterajar) {
        this.semesterajar = semesterajar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodemk != null ? kodemk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MataKuliah_1)) {
            return false;
        }
        MataKuliah_1 other = (MataKuliah_1) object;
        if ((this.kodemk == null && other.kodemk != null) || (this.kodemk != null && !this.kodemk.equals(other.kodemk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbouts.MataKuliah_1[ kodemk=" + kodemk + " ]";
    }
    
}
