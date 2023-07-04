package com.charity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Lover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loverId;
    private String loverName;
    private String loverDonate;
    private double loverMoney;
    private String loverImg;
}
