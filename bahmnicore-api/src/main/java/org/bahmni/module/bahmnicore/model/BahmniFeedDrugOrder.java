package org.bahmni.module.bahmnicore.model;

public class BahmniFeedDrugOrder {
    private int numberOfDays;
    private String productUuid;
    private Double quantity;
    private Double dosage;
    private String unit;

    public BahmniFeedDrugOrder() {
    }

    public BahmniFeedDrugOrder(String productUuid, Double dosage, int numberOfDays, Double quantity, String unit) {
        this.numberOfDays = numberOfDays;
        this.productUuid = productUuid;
        this.quantity = quantity;
        this.dosage = dosage;
        this.unit = unit;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getProductUuid() {
        return productUuid;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getDosage() {
        return dosage;
    }

    public String getUnit() {
        return unit;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
