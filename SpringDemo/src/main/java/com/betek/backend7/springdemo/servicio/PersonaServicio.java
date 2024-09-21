package com.betek.backend7.springdemo.servicio;

import com.betek.backend7.springdemo.exceptions.NotFoundException;
import com.betek.backend7.springdemo.modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonaServicio {
    /*CRUD
    C = created
    R = read
    U = update
    D = delete

    METODOS HTTP
    POST:   CREATED, CREACION
    GET:    READ, LECTURA O VISUALIZACION
    PUT:    UPDATE, ACTUALIZACION
    DELETE: DELETE, ELIMINACION
    */
    //creacion de lista para simular base de datos
    ArrayList<Persona> listaPersonas = new ArrayList<>();

    //crear un metodo para listar todas las personas 'READ'
    public ArrayList<Persona> listaPersonas(){
        return this.listaPersonas;
    }

    //obtener personas por numero de documento 'READ'
    public Optional<Persona> obtenerPersonaPorDocumento(String numeroDocumento){
        return this.listaPersonas
                .stream()
                .filter(persona -> persona.getDocumento().equals(numeroDocumento))
                .findFirst();
    }

    //metodo para crear una personas 'CREATED'
    public Persona crearPersona(Persona persona) {
        if (this.listaPersonas.stream().anyMatch(persona1 -> persona1.getDocumento().equals(persona.getDocumento()))){
            throw new IllegalArgumentException("Ya existe persona con el documento " + persona.getDocumento());
        }
        int id = listaPersonas.size() + 1;
        persona.setId(id);
        this.listaPersonas.add(persona);
        return persona;
    }

    //metodo de actualizacion
    public Persona modificarPersona(Persona persona){
        Persona personaActualizar = this.listaPersonas.stream()
                .filter(persona1 -> persona1.getDocumento().equals(persona.getDocumento()))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("No existe persona con el documento " + persona.getDocumento()));

        personaActualizar.setNombre(persona.getNombre());
        personaActualizar.setApellido(persona.getApellido());
        personaActualizar.setCiudad(persona.getCiudad());

        return personaActualizar;
    }

    //metodo de eliminacion de persona
    public Persona eliminarPersona(String numeroDocumento){
        Optional<Persona> personaEliminar = obtenerPersonaPorDocumento(numeroDocumento);

        personaEliminar.ifPresent(persona -> this.listaPersonas.remove(persona));
        return personaEliminar.get();
    }

    public List<Persona> buscarPersonasPorCiudad(String ciudad) {
        return this.listaPersonas.stream()
                .filter(persona -> persona.getCiudad().equals(ciudad))
                .toList();
    }
}
