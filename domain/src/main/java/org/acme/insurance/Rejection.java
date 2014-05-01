package org.acme.insurance;

public class Rejection  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private java.lang.String reason;

    public Rejection() {
    }

    public Rejection(java.lang.String reason) {
        this.reason = reason;
    }


    
    public java.lang.String getReason() {
        return this.reason;
    }

    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }
}
