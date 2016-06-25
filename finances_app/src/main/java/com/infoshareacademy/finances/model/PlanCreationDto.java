package com.infoshareacademy.finances.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
public class PlanCreationDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PlanActionType planActionType;

    private int quantity;

    private ZonedDateTime actionTime;

    @ManyToOne
    private AssetEntity assetEntity;

    @ManyToOne
    private UserInfoEntity userInfoEntity;


    public PlanCreationDto() {
    }

    public PlanCreationDto(PlanActionType planActionType, int quantity, ZonedDateTime actionTime, AssetEntity assetEntity, UserInfoEntity userInfoEntity) {
        this.planActionType = planActionType;
        this.quantity = quantity;
        this.actionTime = actionTime;
        this.assetEntity = assetEntity;
        this.userInfoEntity = userInfoEntity;
    }

    public Long getId() {
        return id;
    }

    public PlanActionType getPlanActionType() {
        return planActionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public ZonedDateTime getActionTime() {
        return actionTime;
    }

    public AssetEntity getAssetEntity() {
        return assetEntity;
    }

    public UserInfoEntity getUserInfoEntity() {
        return userInfoEntity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setActionTime(ZonedDateTime actionTime) {
        this.actionTime = actionTime;
    }

    public void setAssetEntity(AssetEntity assetEntity) {
        this.assetEntity = assetEntity;
    }

    public void setUserInfoEntity(UserInfoEntity userInfoEntity) {
        this.userInfoEntity = userInfoEntity;
    }

    public void setPlanActionType(PlanActionType planActionType) {
        this.planActionType = planActionType;
    }

    public enum PlanActionType {
        BUY, SELL
    }
}