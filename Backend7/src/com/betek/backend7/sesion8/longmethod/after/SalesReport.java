package com.betek.backend7.sesion8.longmethod.after;

import java.util.Objects;

public final class SalesReport {
    private final double totalSales;
    private final double averageSales;
    private final DatosVentaDto highestSalesData;
    private final DatosVentaDto lowestSalesData;

    public SalesReport(double totalSales, double averageSales, DatosVentaDto highestSalesData,
                       DatosVentaDto lowestSalesData) {
        this.totalSales = totalSales;
        this.averageSales = averageSales;
        this.highestSalesData = highestSalesData;
        this.lowestSalesData = lowestSalesData;
    }

    public double totalSales() {
        return totalSales;
    }

    public double averageSales() {
        return averageSales;
    }

    public DatosVentaDto highestSalesData() {
        return highestSalesData;
    }

    public DatosVentaDto lowestSalesData() {
        return lowestSalesData;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SalesReport) obj;
        return Double.doubleToLongBits(this.totalSales) == Double.doubleToLongBits(that.totalSales) &&
                Double.doubleToLongBits(this.averageSales) == Double.doubleToLongBits(that.averageSales) &&
                Objects.equals(this.highestSalesData, that.highestSalesData) &&
                Objects.equals(this.lowestSalesData, that.lowestSalesData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSales, averageSales, highestSalesData, lowestSalesData);
    }

    @Override
    public String toString() {
        return "SalesReport[" +
                "totalSales=" + totalSales + ", " +
                "averageSales=" + averageSales + ", " +
                "highestSalesData=" + highestSalesData + ", " +
                "lowestSalesData=" + lowestSalesData + ']';
    }

}