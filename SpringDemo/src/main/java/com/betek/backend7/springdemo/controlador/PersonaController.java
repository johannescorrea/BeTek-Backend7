package com.betek.backend7.springdemo.controlador;

import com.betek.backend7.springdemo.modelo.Persona;
import com.betek.backend7.springdemo.servicio.PersonaServicio;
import com.betek.backend7.springdemo.modelo.Pedidos;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/personas")
public class PersonaController {
    ArrayList<Persona> listaPersonas = new ArrayList<>();

    PersonaServicio service = new PersonaServicio();

    @GetMapping()
    public ResponseEntity<List<Persona>> listarPersonas() {
        List<Persona> listaPersonas = this.service.listaPersonas();
        return new ResponseEntity<>(listaPersonas, HttpStatus.OK);
    }

    @GetMapping("{numeroDocumento}")
    public ResponseEntity<Persona> obtenerPersonaPorDocumento(@PathVariable("numeroDocumento") String documento) {
        Optional<Persona> persona = this.service.obtenerPersonaPorDocumento(documento);
        return persona.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        Persona personaCreada = this.service.crearPersona(persona);
        return new ResponseEntity<>(personaCreada, HttpStatus.CREATED);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona) {
        Persona personaCreada = this.service.modificarPersona(persona);
        return new ResponseEntity<>(personaCreada, HttpStatus.OK);
    }

    @GetMapping("{numeroDocumento}/pedidos")
    public ResponseEntity<List<Pedidos>> obtenerPedidosPorPersona(@PathVariable("numeroDocumento") String documento) {
        Optional<Persona> persona = this.service.obtenerPersonaPorDocumento(documento);
        return persona.map(value -> new ResponseEntity<>(value.getPedidos(), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(params = {"ciudad"})
    public ResponseEntity<List<Persona>> buscarPersonasPorCiudad(@RequestParam("ciudad") String ciudad) {
        List<Persona> listaPersonas = this.service.buscarPersonasPorCiudad(ciudad);
        return new ResponseEntity<>(listaPersonas, HttpStatus.OK);
    }
}
