package com.company.vehicle;

public abstract class VehicleType {
    protected String typeName;

    public abstract void move(String vehicleName);

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
