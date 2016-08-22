package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by hovercat on 20.08.16.
 */
@Entity
@Table(name = "SALESREPS", schema = "testDB", catalog = "")
public class SalesrepsEntity {
    private int emplNum;
    private String name;
    private Integer age;
    private Integer repOffice;
    private String title;
    private Date hireDate;
    private Integer manager;
    private BigDecimal quota;
    private BigDecimal sales;

    @Id
    @Column(name = "EMPL_NUM")
    public int getEmplNum() {
        return emplNum;
    }

    public void setEmplNum(int emplNum) {
        this.emplNum = emplNum;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "REP_OFFICE")
    public Integer getRepOffice() {
        return repOffice;
    }

    public void setRepOffice(Integer repOffice) {
        this.repOffice = repOffice;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "HIRE_DATE")
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "MANAGER")
    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    @Basic
    @Column(name = "QUOTA")
    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
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

        SalesrepsEntity salesrepsEntity = (SalesrepsEntity) o;

        if (emplNum != salesrepsEntity.emplNum) return false;
        if (name != null ? !name.equals(salesrepsEntity.name) : salesrepsEntity.name != null) return false;
        if (age != null ? !age.equals(salesrepsEntity.age) : salesrepsEntity.age != null) return false;
        if (repOffice != null ? !repOffice.equals(salesrepsEntity.repOffice) : salesrepsEntity.repOffice != null) return false;
        if (title != null ? !title.equals(salesrepsEntity.title) : salesrepsEntity.title != null) return false;
        if (hireDate != null ? !hireDate.equals(salesrepsEntity.hireDate) : salesrepsEntity.hireDate != null) return false;
        if (manager != null ? !manager.equals(salesrepsEntity.manager) : salesrepsEntity.manager != null) return false;
        if (quota != null ? !quota.equals(salesrepsEntity.quota) : salesrepsEntity.quota != null) return false;
        if (sales != null ? !sales.equals(salesrepsEntity.sales) : salesrepsEntity.sales != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emplNum;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (repOffice != null ? repOffice.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (quota != null ? quota.hashCode() : 0);
        result = 31 * result + (sales != null ? sales.hashCode() : 0);
        return result;
    }
}
