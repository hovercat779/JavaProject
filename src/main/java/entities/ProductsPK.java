package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hovercat on 20.08.16.
 */
public class ProductsPK implements Serializable {
    private String mfrId;
    private String productId;

    @Column(name = "MFR_ID")
    @Id
    public String getMfrId() {
        return mfrId;
    }

    public void setMfrId(String mfrId) {
        this.mfrId = mfrId;
    }

    @Column(name = "PRODUCT_ID")
    @Id
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsPK that = (ProductsPK) o;

        if (mfrId != null ? !mfrId.equals(that.mfrId) : that.mfrId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mfrId != null ? mfrId.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        return result;
    }
}
