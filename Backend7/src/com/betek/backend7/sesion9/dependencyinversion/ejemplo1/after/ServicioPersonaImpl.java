package com.betek.backend7.sesion9.dependencyinversion.ejemplo1.after;

public class ServicioPersonaImpl implements ServicioPersona {

    private ServicioBD servicioDb;

    public ServicioPersonaImpl(ServicioBD servicioDb) {
        this.servicioDb = servicioDb;
    }

    @Override
    public void savePerson(String nombre, String apellido) {
        servicioDb.savePerson(nombre, apellido);
    }
}
