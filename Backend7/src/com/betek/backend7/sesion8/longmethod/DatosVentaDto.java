package com.betek.backend7.sesion8.longmethod;

class DatosVentaDto {
    private String salesPerson;
    private double salesAmount;

    public DatosVentaDto(String salesPerson, double salesAmount) {
        this.salesPerson = salesPerson;
        this.salesAmount = salesAmount;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
}
