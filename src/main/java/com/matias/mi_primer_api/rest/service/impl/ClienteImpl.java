package com.matias.mi_primer_api.rest.service.impl;

import com.matias.mi_primer_api.rest.model.dao.ClienteDao;
import com.matias.mi_primer_api.rest.model.entity.Cliente;
import com.matias.mi_primer_api.rest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Aca vive la logica real del cliente

@Service //Le dice a Spring que esta clase pertenece al negocio
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional //Le dice a la bd o se hace con exito o no se hace nada
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }
    @Transactional(readOnly = true) //Se usa solo en busquedas
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }
}
