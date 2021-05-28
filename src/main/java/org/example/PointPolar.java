package org.example;

import java.util.Objects;

public class PointPolar {
    private double radius;
    private double phi;

    public PointPolar(double radius, double phi) {
        this.radius = radius;
        this.phi = phi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointPolar that = (PointPolar) o;
        return Double.compare(that.radius, radius) == 0 && Double.compare(that.phi, phi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, phi);
    }

    @Override
    public String toString() {
        return "PointPolar{" +
                "radius=" + radius +
                ", phi=" + phi +
                '}';
    }

}