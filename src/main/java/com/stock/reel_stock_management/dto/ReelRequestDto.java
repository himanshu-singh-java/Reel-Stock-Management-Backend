package com.stock.reel_stock_management.dto;

public class ReelRequestDto {

    private String supplier;

    private String millName;

    private int paperGsm;

    private String paperWidth;

    private Double originalWeight;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMillName() {
        return millName;
    }

    public void setMillName(String millName) {
        this.millName = millName;
    }

    public int getPaperGsm() {
        return paperGsm;
    }

    public void setPaperGsm(int paperGsm) {
        this.paperGsm = paperGsm;
    }

    public String getPaperWidth() {
        return paperWidth;
    }

    public void setPaperWidth(String paperWidth) {
        this.paperWidth = paperWidth;
    }

    public Double getOriginalWeight() {
        return originalWeight;
    }

    public void setOriginalWeight(Double originalWeight) {
        this.originalWeight = originalWeight;
    }
}
