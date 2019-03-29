package com.it.model;

import javax.persistence.*;

@Entity
@Table
public class RecommendedValue {
    @Id
    @GeneratedValue
    private Long idRecommendedValue;

    @OneToOne(mappedBy = "recommendedvalue")
    private Flats flats;

    private String recommendedValue;

    public Long getIdRecommendedValue() {
        return idRecommendedValue;
    }

    public void setIdRecommendedValue(Long idRecommendedValue) {
        this.idRecommendedValue = idRecommendedValue;
    }

    public Flats getFlats() {
        return flats;
    }

    public void setFlats(Flats flats) {
        this.flats = flats;
    }

    public String getRecommendedValue() {
        return recommendedValue;
    }

    public void setRecommendedValue(String recommendedValue) {
        this.recommendedValue = recommendedValue;
    }
}
