package com.matias.mi_primer_api.rest.service;

import com.matias.mi_primer_api.rest.model.entity.Cliente;

//ICliente no le interesa como se guardan los datos,solo define
//que puede hacer nuestra aplicacion con un cliente
public interface ICliente {
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);
}
