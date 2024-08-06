package com.betek.backend7.sesion8.longmethod.after;

import java.util.Arrays;
import java.util.List;

public class ReporteVentasService {

    public SalesReport generateAnnualReport(List<DatosVentaDto> salesDataList) {

        double totalSales = calculateTotalSales(salesDataList);

        // Calculate average sales
        double averageSales = totalSales / salesDataList.size();

        DatosVentaDto highestSalesData = getHighesSaleData(salesDataList);
        DatosVentaDto lowestSalesData = getLowestSalesData(salesDataList);

        // Generate report
        return new SalesReport(totalSales, averageSales, highestSalesData, lowestSalesData);
    }

    public void printReport(SalesReport salesReport) {
        System.out.println("Annual Sales Report");
        System.out.println("-------------------");
        System.out.println("Total Sales: " + salesReport.totalSales());
        System.out.println("Average Sales: " + salesReport.averageSales());
        if (salesReport.highestSalesData() != null) {
            System.out.println("Highest Sales: " + salesReport.highestSalesData().getSalesAmount() + " by " + salesReport.highestSalesData().getSalesPerson());
        }
        if (salesReport.lowestSalesData() != null) {
            System.out.println("Lowest Sales: " + salesReport.lowestSalesData().getSalesAmount() + " by " + salesReport.lowestSalesData().getSalesPerson());
        }
    }

    private static DatosVentaDto getLowestSalesData(List<DatosVentaDto> salesDataList) {
        double lowestSales = Double.MAX_VALUE;
        DatosVentaDto lowestSalesData = null;
        for (DatosVentaDto data : salesDataList) {
            if (data.getSalesAmount() < lowestSales) {
                lowestSales = data.getSalesAmount();
                lowestSalesData = data;
            }
        }
        return lowestSalesData;
    }

    private DatosVentaDto getHighesSaleData(List<DatosVentaDto> salesDataList) {
        DatosVentaDto highestSalesData = null;
        double highestSales = Double.MIN_VALUE;
        for (DatosVentaDto data : salesDataList) {
            if (data.getSalesAmount() > highestSales) {
                highestSales = data.getSalesAmount();
                highestSalesData = data;
            }
        }
        return highestSalesData;
    }

    private double calculateTotalSales(List<DatosVentaDto> salesDataList) {
        double totalSales = 0;
        for (DatosVentaDto data : salesDataList) {
            totalSales += data.getSalesAmount();
        }
        return totalSales;
    }

    public static void main(String[] args) {
        List<DatosVentaDto> salesDataList = Arrays.asList(
                new DatosVentaDto("Alice", 5000),
                new DatosVentaDto("Bob", 7000),
                new DatosVentaDto("Charlie", 3000),
                new DatosVentaDto("Diana", 8000)
        );

        ReporteVentasService reportGenerator = new ReporteVentasService();
        SalesReport reporte = reportGenerator.generateAnnualReport(salesDataList);
        reportGenerator.printReport(reporte);
    }
}

