package com.matias.mi_primer_api.rest.controller;

import com.matias.mi_primer_api.rest.model.dto.ClienteDto;
import com.matias.mi_primer_api.rest.model.entity.Cliente;
import com.matias.mi_primer_api.rest.service.ICliente;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController //Le indicamos que la clase es un controlador
@RequestMapping("/api/v1") //Indicamos que el controlador va a ser utilizado como recurso, para que trabajen con los metodos que se encuentran aqui

public class ClienteController {

    @Autowired
    private ICliente clienteService;

    //@RequestBody lo que hace es que cuando me envien por medio de JSON la informacion se va a transformar al obj Cliente
    //@ResponseStatus es para personalizar los estados (200 O 201).
    @PostMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto create(@RequestBody ClienteDto cliente){

        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto update(@RequestBody ClienteDto cliente){

        return clienteService.save(cliente);
    }
    //@PathVariable toma el id del JSON y lo guarda en el parametro id
    //ResponseEntity<?> es un generico en donde si todo sale bien devuelve un Obj Cliente y si no un Map con el error
    //
    @DeleteMapping("cliente/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();
        try {
            ClienteDto clienteDelete = clienteService.findById(id);
            clienteService.delete(clienteDelete);
            return new ResponseEntity<>(clienteDelete, HttpStatus.NO_CONTENT);
        } catch (DataAccessException exDt) {
            response.put("mensaje", exDt.getMessage());
            response.put("cliente", null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClienteDto showById(@PathVariable Integer id){

        return clienteService.findById(id);
    }
}
