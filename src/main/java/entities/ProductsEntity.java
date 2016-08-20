package entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by hovercat on 20.08.16.
 */
@Entity
@IdClass(ProductsPK.class)
public class ProductsEntity {
    private String mfrId;
    private String productId;
    private String description;
    private BigDecimal price;
    private int qtyOnHand;

    @Id
    @Column(name = "MFR_ID")
    public String getMfrId() {
        return mfrId;
    }

    public void setMfrId(String mfrId) {
        this.mfrId = mfrId;
    }

    @Id
    @Column(name = "PRODUCT_ID")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "QTY_ON_HAND")
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity productsEntity = (ProductsEntity) o;

        if (qtyOnHand != productsEntity.qtyOnHand) return false;
        if (mfrId != null ? !mfrId.equals(productsEntity.mfrId) : productsEntity.mfrId != null) return false;
        if (productId != null ? !productId.equals(productsEntity.productId) : productsEntity.productId != null) return false;
        if (description != null ? !description.equals(productsEntity.description) : productsEntity.description != null)
            return false;
        if (price != null ? !price.equals(productsEntity.price) : productsEntity.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mfrId != null ? mfrId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + qtyOnHand;
        return result;
    }
}
