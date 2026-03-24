package com.matias.mi_primer_api.rest.model.dao;

import com.matias.mi_primer_api.rest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

//Clase DAO o Repository: Significa Data Access Object. Es un patron de diseño qie sirve
//para separar la logica de la aplicacion de la bd. El codigo le pide a DAO
// que guarde los datos, no interesa en donde.
//Con CrudRepository<Cliente,Integer>  ganamos metodos sin lineas de codigo
//heredamos findAll() findById(id) save(cliente) delete(cliente)
public interface ClienteDao extends CrudRepository<Cliente,Integer> {
}
