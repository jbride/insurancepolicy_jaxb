package org.acme.insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policy", propOrder = {
    "driver",
    "policyType",
    "price",
    "priceDiscount",
    "vehicleYear"
})
public class Policy  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private org.acme.insurance.Driver driver;
    
    private java.lang.String policyType;
    
    private java.lang.Integer price;
    
    private java.lang.Integer priceDiscount;
    
    private java.lang.Integer vehicleYear;

    public Policy() {
    }

    public Policy(java.lang.String policyType, java.lang.Integer vehicleYear, java.lang.Integer price, java.lang.Integer priceDiscount, org.acme.insurance.Driver driver) {
        this.policyType = policyType;
        this.vehicleYear = vehicleYear;
        this.price = price;
        this.priceDiscount = priceDiscount;
        this.driver = driver;
    }


    
    public org.acme.insurance.Driver getDriver() {
        return this.driver;
    }

    public void setDriver(org.acme.insurance.Driver driver) {
        this.driver = driver;
    }
    
    public java.lang.String getPolicyType() {
        return this.policyType;
    }

    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }
    
    public java.lang.Integer getPrice() {
        return this.price;
    }

    public void setPrice(java.lang.Integer price) {
        this.price = price;
    }
    
    public java.lang.Integer getPriceDiscount() {
        return this.priceDiscount;
    }

    public void setPriceDiscount(java.lang.Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }
    
    public java.lang.Integer getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(java.lang.Integer vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("\n\tpolicyType : " +policyType);
        sBuilder.append("\n\tprice : " +price);
        sBuilder.append("\n\tpriceDiscount : " +priceDiscount);
        sBuilder.append("\n\tvehicle year : "+vehicleYear);
        sBuilder.append("\n\tdriver : " +driver);
        return sBuilder.toString();
    }

}
