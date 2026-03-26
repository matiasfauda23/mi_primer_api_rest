package com.matias.mi_primer_api.rest.service;

import com.matias.mi_primer_api.rest.model.dto.ClienteDto;
import com.matias.mi_primer_api.rest.model.entity.Cliente;
import org.springframework.transaction.annotation.Transactional;

//ICliente no le interesa como se guardan los datos,solo define
//que puede hacer nuestra aplicacion con un cliente
public interface ICliente {

        @Transactional
        //Le dice a la bd o se hace con exito o no se hace nada
        ClienteDto save(ClienteDto clienteDto);

        ClienteDto findById(Integer id);
        void delete(ClienteDto clienteDto);
}
