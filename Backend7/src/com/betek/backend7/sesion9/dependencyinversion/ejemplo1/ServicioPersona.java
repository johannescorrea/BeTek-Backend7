package com.betek.backend7.sesion9.dependencyinversion.ejemplo1;

public class ServicioPersona {
    private MySql mySql;

    public ServicioPersona(MySql mySql) {
        this.mySql = mySql;
    }

    public void savePerson(String nombre, String apellido) {
        mySql.savePerson(nombre, apellido);
    }
}
