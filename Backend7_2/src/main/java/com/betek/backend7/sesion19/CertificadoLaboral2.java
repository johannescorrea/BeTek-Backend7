package com.betek.backend7.sesion19;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@ToString
public class CertificadoLaboral2 {

    private String nombreEmpleado;
    private String identificacionEmpleado;
    private String cargo;
    private String fechaIngreso;

    //atributos opcionales de un certificado
    private String fechaSalida;
    private String motivoSalida;
    private String salario;
    private String dirigidoA;

}
