package com.betek.backend7.sesion19;

public class Patrones {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        CertificadoLaboral certificado = CertificadoLaboral.builder()
                .buildWithBasicData("Juan", "123", "Ingeniero", "2020-01-01")
                .withFechaSalida("2021-01-01")
                .build();

        certificado = CertificadoLaboral.builder()
                .buildWithBasicData("Juan", "123", "Ingeniero", "2020-01-01")
                .withFechaSalida("2021-01-01")
                .withDirigidoA("BeTek S.A")
                .build();

        CertificadoLaboral2 certificado2 = CertificadoLaboral2.builder()
                .fechaSalida("2021-01-01").build();
    }
}
