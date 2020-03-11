package com.asterixnick.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity(name = "Trainer")
@Table(name = "trainer")

@NamedQuery(name = "Trainer.findLikeName", query = "SELECT t FROM Trainer t WHERE t.tlname LIKE : name")

public class Trainer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private int tid;
    @NotEmpty
    @Column(name = "tfname")
    private String tfname;
    @NotEmpty
    @Column(name = "tlname")
    private String tlname;
    @NotEmpty
    @Column(name = "tsub")
    private String tsub;

    public Trainer() {
    }

    public Trainer(int tid, String tfname, String tlname, String tsub) {
        this.tid = tid;
        this.tfname = tfname;
        this.tlname = tlname;
        this.tsub = tsub;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTfname() {
        return tfname;
    }

    public void setTfname(String tfname) {
        this.tfname = tfname;
    }

    public String getTlname() {
        return tlname;
    }

    public void setTlname(String tlname) {
        this.tlname = tlname;
    }

    public String getTsub() {
        return tsub;
    }

    public void setTsub(String tsub) {
        this.tsub = tsub;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.tid;
        hash = 17 * hash + Objects.hashCode(this.tfname);
        hash = 17 * hash + Objects.hashCode(this.tlname);
        hash = 17 * hash + Objects.hashCode(this.tsub);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trainer other = (Trainer) obj;
        if (this.tid != other.tid) {
            return false;
        }
        if (!Objects.equals(this.tfname, other.tfname)) {
            return false;
        }
        if (!Objects.equals(this.tlname, other.tlname)) {
            return false;
        }
        if (!Objects.equals(this.tsub, other.tsub)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trainer{" + "tid=" + tid + ", tfname=" + tfname + ", tlname=" + tlname + ", tsub=" + tsub + '}';
    }

}
