package com.stock.reel_stock_management.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reels")
public class Reel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "reel_id")
    private Long reelId;

    @Column(name = "reel_serial_no", unique = true, nullable = false)
    private String reelSerialNo;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "mill_name")
    private String millName;

    @Column(name = "paper_gsm")
    private int paperGsm;

    @Column(name = "paper_width")
    private String paperWidth;

    @Column(name = "original_weight")
    private Double originalWeight;

    @Column(name = "current_weight")
    private Double currentWeight;

    @Column(name = "status")
    private String status;

    @Column(name = "received_date")
    private LocalDateTime receivedDate;

    @PrePersist
    public void prePersist(){
        this.receivedDate = LocalDateTime.now();

        if(this.status == null){
            this.status = "AVAILABLE";
        }

        if(currentWeight == null){
            this.currentWeight = this.originalWeight;
        }
    }


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
