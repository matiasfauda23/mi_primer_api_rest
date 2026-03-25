package com.matias.mi_primer_api.rest.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
//La dependencia Lombok nos permite trabajar mediante anotaciones
@Data //Me genera setters, getters , hashcode , Equals automaticamente
@AllArgsConstructor //Que me genere el constructor con todos sus argumentos
@NoArgsConstructor //Genera un constructor vacio
@ToString
@Entity //Definimos que esta clase es una entidad
@Table(name = "clientes") //Le indicamos que la clase debe hacer referecia a la tabla con nombre "clientes"

public class Cliente implements Serializable {
    @Id //Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id autoincrementable

    //Parametros de la tabla Cliente
    @Column(name = "id_cliente") //En mi codigo es idCliente, pero cuando lo busque en la db lo encontramos con el nombre id_cliente
    private Integer idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;


}
