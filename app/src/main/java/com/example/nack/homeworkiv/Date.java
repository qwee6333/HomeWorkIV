package com.example.nack.homeworkiv;

import java.io.Serializable;

/**
 * Created by Nack on 2015/4/3.
 */
public class Date implements Serializable {
    private double height;
    private double weight;
    public Date(double height,double weight) {
        this.height=height;
        this.weight=weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
