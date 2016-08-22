package entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by hovercat on 20.08.16.
 */
@Entity
@Table(name = "CUSTOMERS", schema = "testDB", catalog = "")
public class CustomersEntity {
    private int custNum;
    private String company;
    private Integer custRep;
    private BigDecimal creditLimit;

    @Id
    @Column(name = "CUST_NUM")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    @Basic
    @Column(name = "COMPANY")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "CUST_REP")
    public Integer getCustRep() {
        return custRep;
    }

    public void setCustRep(Integer custRep) {
        this.custRep = custRep;
    }

    @Basic
    @Column(name = "CREDIT_LIMIT")
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersEntity customersEntity = (CustomersEntity) o;

        if (custNum != customersEntity.custNum) return false;
        if (company != null ? !company.equals(customersEntity.company) : customersEntity.company != null) return false;
        if (custRep != null ? !custRep.equals(customersEntity.custRep) : customersEntity.custRep != null) return false;
        if (creditLimit != null ? !creditLimit.equals(customersEntity.creditLimit) : customersEntity.creditLimit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = custNum;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (custRep != null ? custRep.hashCode() : 0);
        result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
        return result;
    }
}
