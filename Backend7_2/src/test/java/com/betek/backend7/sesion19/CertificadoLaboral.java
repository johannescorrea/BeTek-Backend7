package com.betek.backend7.sesion19;

public class CertificadoLaboral {

    private String nombreEmpleado;
    private String identificacionEmpleado;
    private String cargo;
    private String fechaIngreso;

    //atributos opcionales de un certificado
    private String fechaSalida;
    private String motivoSalida;
    private String salario;
    private String dirigidoA;

    private CertificadoLaboral() {
    }

    private CertificadoLaboral(String nombreEmpleado, String identificacionEmpleado, String cargo, String fechaIngreso) {
        this.nombreEmpleado = nombreEmpleado;
        this.identificacionEmpleado = identificacionEmpleado;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    private void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    private void setIdentificacionEmpleado(String identificacionEmpleado) {
        this.identificacionEmpleado = identificacionEmpleado;
    }

    private void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    private void setMotivoSalida(String motivoSalida) {
        this.motivoSalida = motivoSalida;
    }

    private void setSalario(String salario) {
        this.salario = salario;
    }

    private void setDirigidoA(String dirigidoA) {
        this.dirigidoA = dirigidoA;
    }

    public static CertificadoLaboralBuilder builder() {
        return new CertificadoLaboralBuilder();
    }

    public static class CertificadoLaboralBuilder {

        private CertificadoLaboral certificado;

        public CertificadoLaboralBuilder() {
            certificado = new CertificadoLaboral();
        }

        public CertificadoLaboralBuilder buildWithBasicData(String nombre, String identificacion, String cargo, String fechaIngreso) {
            certificado = new CertificadoLaboral( nombre,  identificacion,  cargo,  fechaIngreso);
            return this;

        }

        public CertificadoLaboralBuilder withFechaSalida(String fechaSalida) {
            certificado.setFechaSalida(fechaSalida);
            return this;
        }

        public CertificadoLaboralBuilder withDirigidoA(String dirigidoA) {
            certificado.setDirigidoA(dirigidoA);
            return this;
        }

        public CertificadoLaboral build() {
            return certificado;
        }
    }
}
