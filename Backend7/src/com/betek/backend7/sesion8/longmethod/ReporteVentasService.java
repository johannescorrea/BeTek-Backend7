package com.betek.backend7.sesion8.longmethod;

import java.util.Arrays;
import java.util.List;

public class ReporteVentasService {

    public void generateAnnualReport(List<DatosVentaDto> salesDataList) {
        // Calculate total sales
        double totalSales = 0;
        for (DatosVentaDto data : salesDataList) {
            totalSales += data.getSalesAmount();
        }

        // Calculate average sales
        double averageSales = totalSales / salesDataList.size();

        // Find highest sales
        double highestSales = Double.MIN_VALUE;
        DatosVentaDto highestSalesData = null;
        for (DatosVentaDto data : salesDataList) {
            if (data.getSalesAmount() > highestSales) {
                highestSales = data.getSalesAmount();
                highestSalesData = data;
            }
        }

        // Find lowest sales
        double lowestSales = Double.MAX_VALUE;
        DatosVentaDto lowestSalesData = null;
        for (DatosVentaDto data : salesDataList) {
            if (data.getSalesAmount() < lowestSales) {
                lowestSales = data.getSalesAmount();
                lowestSalesData = data;
            }
        }

        // Generate report
        System.out.println("Annual Sales Report");
        System.out.println("-------------------");
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        if (highestSalesData != null) {
            System.out.println("Highest Sales: " + highestSales + " by " + highestSalesData.getSalesPerson());
        }
        if (lowestSalesData != null) {
            System.out.println("Lowest Sales: " + lowestSales + " by " + lowestSalesData.getSalesPerson());
        }
    }

    public static void main(String[] args) {
        List<DatosVentaDto> salesDataList = Arrays.asList(
                new DatosVentaDto("Alice", 5000),
                new DatosVentaDto("Bob", 7000),
                new DatosVentaDto("Charlie", 3000),
                new DatosVentaDto("Diana", 8000)
        );

        ReporteVentasService reportGenerator = new ReporteVentasService();
        reportGenerator.generateAnnualReport(salesDataList);
    }
}