package com.matias.mi_primer_api.rest.model.dto;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
//Dto (Data Transfer Object) sirve para transportar datos entre el cliente (PostMan  Navegador) y nuestro servidor


//La dependencia Lombok nos permite trabajar mediante anotaciones
@Data //Me genera setters, getters , hashcode , Equals automaticamente
@NoArgsConstructor //Genera un constructor vacio
@ToString
@Builder //Patron de diseño

public class ClienteDto implements Serializable {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaRegistro;


}
