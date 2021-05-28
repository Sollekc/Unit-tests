package org.example;

import java.util.Objects;

public class Adapter {
    private PointPolar pointPolar;

    public Adapter(PointPolar pointPolar) {
        this.pointPolar = pointPolar;
    }

    public PointDecart transform(){
        return new PointDecart(Math.cos(pointPolar.getPhi()) * pointPolar.getRadius(),
                Math.sin(pointPolar.getPhi())*pointPolar.getRadius());
    }

}