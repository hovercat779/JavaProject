package entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by hovercat on 20.08.16.
 */
@Entity
@Table(name = "OFFICES", schema = "testDB", catalog = "")
public class OfficesEntity {
    private int office;
    private String city;
    private String region;
    private BigDecimal target;
    private BigDecimal sales;
    private Integer mgr;

    @Id
    @Column(name = "OFFICE")
    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "REGION")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "TARGET")
    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    @Basic
    @Column(name = "SALES")
    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficesEntity officesEntity = (OfficesEntity) o;

        if (office != officesEntity.office) return false;
        if (city != null ? !city.equals(officesEntity.city) : officesEntity.city != null) return false;
        if (region != null ? !region.equals(officesEntity.region) : officesEntity.region != null) return false;
        if (target != null ? !target.equals(officesEntity.target) : officesEntity.target != null) return false;
        if (sales != null ? !sales.equals(officesEntity.sales) : officesEntity.sales != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = office;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (sales != null ? sales.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "MGR")
    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }
}
