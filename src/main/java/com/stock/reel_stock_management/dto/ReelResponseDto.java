package com.stock.reel_stock_management.dto;

import java.time.LocalDateTime;

public class ReelResponseDto {

    private Long reelId;

    private String reelSerialNo;

    private String supplier;

    private String millName;

    private int paperGsm;

    private String paperWidth;

    private Double originalWeight;

    private Double currentWeight;

    private String status;

    private LocalDateTime receivedDate;

    public Long getReelId() {
        return reelId;
    }

    public void setReelId(Long reelId) {
        this.reelId = reelId;
    }

    public String getReelSerialNo() {
        return reelSerialNo;
    }

    public void setReelSerialNo(String reelSerialNo) {
        this.reelSerialNo = reelSerialNo;
    }

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

    public Double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }
}
