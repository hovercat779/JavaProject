package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by hovercat on 20.08.16.
 */
@Entity
public class OrdersEntity {
    private int orderNum;
    private Date orderDate;
    private int cust;
    private Integer rep;
    private String mfr;
    private String product;
    private int qty;
    private BigDecimal amount;

    @Id
    @Column(name = "ORDER_NUM")
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "ORDER_DATE")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "CUST")
    public int getCust() {
        return cust;
    }

    public void setCust(int cust) {
        this.cust = cust;
    }

    @Basic
    @Column(name = "REP")
    public Integer getRep() {
        return rep;
    }

    public void setRep(Integer rep) {
        this.rep = rep;
    }

    @Basic
    @Column(name = "MFR")
    public String getMfr() {
        return mfr;
    }

    public void setMfr(String mfr) {
        this.mfr = mfr;
    }

    @Basic
    @Column(name = "PRODUCT")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "QTY")
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "AMOUNT")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity ordersEntity = (OrdersEntity) o;

        if (orderNum != ordersEntity.orderNum) return false;
        if (cust != ordersEntity.cust) return false;
        if (qty != ordersEntity.qty) return false;
        if (orderDate != null ? !orderDate.equals(ordersEntity.orderDate) : ordersEntity.orderDate != null) return false;
        if (rep != null ? !rep.equals(ordersEntity.rep) : ordersEntity.rep != null) return false;
        if (mfr != null ? !mfr.equals(ordersEntity.mfr) : ordersEntity.mfr != null) return false;
        if (product != null ? !product.equals(ordersEntity.product) : ordersEntity.product != null) return false;
        if (amount != null ? !amount.equals(ordersEntity.amount) : ordersEntity.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNum;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + cust;
        result = 31 * result + (rep != null ? rep.hashCode() : 0);
        result = 31 * result + (mfr != null ? mfr.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + qty;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
